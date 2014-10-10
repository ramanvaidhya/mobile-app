package com.football.reminder.dao;
import java.util.ArrayList;import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.football.reminder.ivomapper.TeamSupportMapper;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;import com.football.reminder.model.TeamSupportModel;
import com.football.reminder.vo.TeamSupport;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamSupportDAO extends BaseDAO implements ITeamSupportDAO {
public TeamSupportModel TeamSupportAdd(TeamSupportModel TeamSupportModel) throws Exception {
SqlSession session = getSqlSession();
try{TeamSupportMapper TeamSupportmapper=session.getMapper(TeamSupportMapper.class);
TeamSupportmapper.insert(TeamSupportModel.getTeamSupport());
TeamSupportModel.setSucessesValid(true);
TeamSupportModel.setSucesses("Add Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  TeamSupportModel.setErrorValid(true);
TeamSupportModel.setError("Add failed");throw e;
 }
return TeamSupportModel;
}public TeamSupportModel TeamSupportUpdate(TeamSupportModel TeamSupportModel) throws Exception {
SqlSession session = getSqlSession();
try{TeamSupportMapper TeamSupportmapper=session.getMapper(TeamSupportMapper.class);
TeamSupportmapper.updateByPrimaryKey(TeamSupportModel.getTeamSupport());
TeamSupportModel.setSucessesValid(true);
TeamSupportModel.setSucesses("Update Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  TeamSupportModel.setErrorValid(true);
TeamSupportModel.setError("Update failed");throw e;
 }
return TeamSupportModel;
}public TeamSupportModel TeamSupportSelect(TeamSupportModel TeamSupportModel) throws Exception {
SqlSession session = getSqlSession();
try{TeamSupportMapper TeamSupportmapper=session.getMapper(TeamSupportMapper.class);
TeamSupportModel.setListTeamSupport(TeamSupportmapper.selectSearch(TeamSupportModel.getTeamSupport()));
if(TeamSupportModel.getListTeamSupport()!=null&&TeamSupportModel.getListTeamSupport().size()>0)
{
TeamSupportModel.setSearch(true);
}
else
{
 TeamSupportModel.setErrorValid(true);
TeamSupportModel.setError("No Results Found");
}
}
catch (Exception e) {
e.printStackTrace();
  TeamSupportModel.setErrorValid(true);
TeamSupportModel.setError("Select failed");throw e;
 }
return TeamSupportModel;
}public List<TeamSupport> TeamSupportSelectAll() throws Exception {
SqlSession session = getSqlSession();
List<TeamSupport> listTeamSupport= new ArrayList<TeamSupport>();
try{TeamSupportMapper TeamSupportmapper=session.getMapper(TeamSupportMapper.class);
 listTeamSupport=TeamSupportmapper.selectAll();
}
catch (Exception e) {
e.printStackTrace();
throw e;
   }
return listTeamSupport;
}public TeamSupportModel TeamSupportDelete(TeamSupportModel TeamSupportModel) throws Exception {
SqlSession session = getSqlSession();
try{TeamSupportMapper TeamSupportmapper=session.getMapper(TeamSupportMapper.class);
TeamSupportmapper.deleteByPrimaryKey(TeamSupportModel.getTeamSupport().getId());
TeamSupportModel.setSucessesValid(true);
TeamSupportModel.setSucesses("Delete Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  TeamSupportModel.setErrorValid(true);
TeamSupportModel.setError("Delete failed");throw e;
 }
return TeamSupportModel;
}public TeamSupportModel TeamSupportUpdateFetch(TeamSupportModel TeamSupportModel) throws Exception {
SqlSession session = getSqlSession();
try{TeamSupportMapper TeamSupportmapper=session.getMapper(TeamSupportMapper.class);
TeamSupportModel.setTeamSupport(TeamSupportmapper.selectByPrimaryKey(TeamSupportModel.getTeamSupport().getId()));
TeamSupportModel.setSucessesValid(true);
TeamSupportModel.setSucesses("UpdateFetch Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  TeamSupportModel.setErrorValid(true);
TeamSupportModel.setError("UpdateFetch failed");throw e;
 }
return TeamSupportModel;
}@Transactional
public TeamSupportModel TeamSupportMassUpdate(TeamSupportModel TeamSupportModel) throws Exception {
SqlSession session = getSqlSession();
try{TeamSupportMapper TeamSupportmapper=session.getMapper(TeamSupportMapper.class);
TeamSupportModel.setSucessesValid(true);
TeamSupportModel.setSucesses("MassUpdate Sucessful");
for (int i = 0; i < TeamSupportModel.getListTeamSupport().size(); i++) {
TeamSupportmapper.updateByPrimaryKey(TeamSupportModel.getListTeamSupport().get(i));
}
}
catch (Exception e) {
e.printStackTrace();
  TeamSupportModel.setErrorValid(true);
TeamSupportModel.setError("MassUpdate failed");TeamSupportModel.setMassUpdate(true);
throw e;
 }
return TeamSupportModel;
}@Transactional
public TeamSupportModel TeamSupportMassAdd(TeamSupportModel TeamSupportModel) throws Exception {
SqlSession session = getSqlSession();
try{TeamSupportMapper TeamSupportmapper=session.getMapper(TeamSupportMapper.class);
TeamSupportModel.setSucessesValid(true);
TeamSupportModel.setSucesses("MassAdd Sucessful");
for (int i = 0; i < TeamSupportModel.getListTeamSupport().size(); i++) {
TeamSupportmapper.insert(TeamSupportModel.getListTeamSupport().get(i));
}
}
catch (Exception e) {
e.printStackTrace();
  TeamSupportModel.setErrorValid(true);
TeamSupportModel.setError("MassAdd failed");TeamSupportModel.setMassAdd(true);
throw e;
 }
return TeamSupportModel;
}}