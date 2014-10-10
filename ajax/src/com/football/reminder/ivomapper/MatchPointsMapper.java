package com.football.reminder.ivomapper;

import java.util.List;
import com.football.reminder.vo.MatchPoints;

public interface MatchPointsMapper {
    int deleteByPrimaryKey(Integer id);

List<MatchPoints> selectSearch(MatchPoints record);

List<MatchPoints> selectAll();

    int insert(MatchPoints record);

    int insertSelective(MatchPoints record);

    MatchPoints selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MatchPoints record);

    int updateByPrimaryKey(MatchPoints record);
}
