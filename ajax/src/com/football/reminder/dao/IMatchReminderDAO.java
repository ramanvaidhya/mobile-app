package com.football.reminder.dao;
import com.football.reminder.model.MatchReminderModel;
import com.football.reminder.vo.MatchReminder;
import java.util.ArrayList;
import java.util.List;

public interface IMatchReminderDAO {
public MatchReminderModel MatchReminderAdd(MatchReminderModel MatchReminderModel) throws Exception ;
public MatchReminderModel MatchReminderUpdate(MatchReminderModel MatchReminderModel) throws Exception ;
public MatchReminderModel MatchReminderSelect(MatchReminderModel MatchReminderModel) throws Exception ;
public List<MatchReminder> MatchReminderSelectAll() throws Exception ;
public MatchReminderModel MatchReminderDelete(MatchReminderModel MatchReminderModel) throws Exception ;
public MatchReminderModel MatchReminderUpdateFetch(MatchReminderModel MatchReminderModel) throws Exception ;
public MatchReminderModel MatchReminderMassUpdate(MatchReminderModel MatchReminderModel) throws Exception ;
public MatchReminderModel MatchReminderMassAdd(MatchReminderModel MatchReminderModel) throws Exception ;
}
