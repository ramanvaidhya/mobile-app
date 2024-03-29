package com.mkyong.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.football.reminder.dao.IMatchPointsDAO;
import com.football.reminder.model.MatchPointsModel;
import com.football.reminder.vo.MatchPoints;
import com.mkyong.web.domain.Tag;

@Controller
public class MainController {

	@Autowired
	private IMatchPointsDAO matchPointsDAO;
	List<Tag> data = new ArrayList<Tag>();

	MainController() {
		// init data for testing
		data.add(new Tag(1, "ruby"));
		data.add(new Tag(2, "rails"));
		data.add(new Tag(3, "c / c++"));
		data.add(new Tag(4, ".net"));
		data.add(new Tag(5, "python"));
		data.add(new Tag(6, "java"));
		data.add(new Tag(7, "javascript"));
		data.add(new Tag(8, "jscript"));

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getPages() {

		ModelAndView model = new ModelAndView("example");
		return model;

	}

	@RequestMapping(value = "/getPointsTable", method = RequestMethod.GET)
	public @ResponseBody
	List<MatchPoints> getTags(@RequestParam String leagueName) {

MatchPointsModel MatchPointsModel = new MatchPointsModel();
try {
	MatchPoints matchPoints = new MatchPoints();
	matchPoints.setLeagueType(leagueName);
	MatchPointsModel = matchPointsDAO.MatchPointsSelect(MatchPointsModel);
	System.out.println(MatchPointsModel.getListMatchPoints().size());
} catch (Exception e) {
	e.printStackTrace();
}
		return MatchPointsModel.getListMatchPoints();

	}

	private List<Tag> simulateSearchResult(String tagName) {

		List<Tag> result = new ArrayList<Tag>();

		// iterate a list and filter by tagName
		for (Tag tag : data) {
			if (tag.getTagName().contains(tagName)) {
				result.add(tag);
			}
		}

		return result;
	}

}
