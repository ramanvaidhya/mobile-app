package com.football.reminder.dao;
import com.football.reminder.model.MatchPointsModel;
import com.football.reminder.vo.MatchPoints;
import java.util.ArrayList;
import java.util.List;

public interface IMatchPointsDAO {
public MatchPointsModel MatchPointsAdd(MatchPointsModel MatchPointsModel) throws Exception ;
public MatchPointsModel MatchPointsUpdate(MatchPointsModel MatchPointsModel) throws Exception ;
public MatchPointsModel MatchPointsSelect(MatchPointsModel MatchPointsModel) throws Exception ;
public List<MatchPoints> MatchPointsSelectAll() throws Exception ;
public MatchPointsModel MatchPointsDelete(MatchPointsModel MatchPointsModel) throws Exception ;
public MatchPointsModel MatchPointsUpdateFetch(MatchPointsModel MatchPointsModel) throws Exception ;
public MatchPointsModel MatchPointsMassUpdate(MatchPointsModel MatchPointsModel) throws Exception ;
public MatchPointsModel MatchPointsMassAdd(MatchPointsModel MatchPointsModel) throws Exception ;
}
