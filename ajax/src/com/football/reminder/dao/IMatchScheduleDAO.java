package com.football.reminder.dao;
import com.football.reminder.model.MatchScheduleModel;
import com.football.reminder.vo.MatchSchedule;
import java.util.ArrayList;
import java.util.List;

public interface IMatchScheduleDAO {
public MatchScheduleModel MatchScheduleAdd(MatchScheduleModel MatchScheduleModel) throws Exception ;
public MatchScheduleModel MatchScheduleUpdate(MatchScheduleModel MatchScheduleModel) throws Exception ;
public MatchScheduleModel MatchScheduleSelect(MatchScheduleModel MatchScheduleModel) throws Exception ;
public List<MatchSchedule> MatchScheduleSelectAll() throws Exception ;
public MatchScheduleModel MatchScheduleDelete(MatchScheduleModel MatchScheduleModel) throws Exception ;
public MatchScheduleModel MatchScheduleUpdateFetch(MatchScheduleModel MatchScheduleModel) throws Exception ;
public MatchScheduleModel MatchScheduleMassUpdate(MatchScheduleModel MatchScheduleModel) throws Exception ;
public MatchScheduleModel MatchScheduleMassAdd(MatchScheduleModel MatchScheduleModel) throws Exception ;
}
