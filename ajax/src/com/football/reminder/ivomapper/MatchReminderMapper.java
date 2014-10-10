package com.football.reminder.ivomapper;

import java.util.List;
import com.football.reminder.vo.MatchReminder;

public interface MatchReminderMapper {
    int deleteByPrimaryKey(Long id);

List<MatchReminder> selectSearch(MatchReminder record);

List<MatchReminder> selectAll();

    int insert(MatchReminder record);

    int insertSelective(MatchReminder record);

    MatchReminder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MatchReminder record);

    int updateByPrimaryKey(MatchReminder record);
}
