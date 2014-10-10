package com.football.reminder.ivomapper;

import java.util.List;
import com.football.reminder.vo.MatchSchedule;

public interface MatchScheduleMapper {
    int deleteByPrimaryKey(Integer matchId);

List<MatchSchedule> selectSearch(MatchSchedule record);

List<MatchSchedule> selectAll();

    int insert(MatchSchedule record);

    int insertSelective(MatchSchedule record);

    MatchSchedule selectByPrimaryKey(Integer matchId);

    int updateByPrimaryKeySelective(MatchSchedule record);

    int updateByPrimaryKey(MatchSchedule record);
}
