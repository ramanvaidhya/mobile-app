package com.football.reminder.dao;
import com.football.reminder.model.TeamSupportModel;
import com.football.reminder.vo.TeamSupport;
import java.util.ArrayList;
import java.util.List;

public interface ITeamSupportDAO {
public TeamSupportModel TeamSupportAdd(TeamSupportModel TeamSupportModel) throws Exception ;
public TeamSupportModel TeamSupportUpdate(TeamSupportModel TeamSupportModel) throws Exception ;
public TeamSupportModel TeamSupportSelect(TeamSupportModel TeamSupportModel) throws Exception ;
public List<TeamSupport> TeamSupportSelectAll() throws Exception ;
public TeamSupportModel TeamSupportDelete(TeamSupportModel TeamSupportModel) throws Exception ;
public TeamSupportModel TeamSupportUpdateFetch(TeamSupportModel TeamSupportModel) throws Exception ;
public TeamSupportModel TeamSupportMassUpdate(TeamSupportModel TeamSupportModel) throws Exception ;
public TeamSupportModel TeamSupportMassAdd(TeamSupportModel TeamSupportModel) throws Exception ;
}
