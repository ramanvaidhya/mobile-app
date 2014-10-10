package com.football.reminder.dao;
import java.util.ArrayList;import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.football.reminder.ivomapper.MatchScheduleMapper;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;import com.football.reminder.model.MatchScheduleModel;
import com.football.reminder.vo.MatchSchedule;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MatchScheduleDAO extends BaseDAO implements IMatchScheduleDAO {
public MatchScheduleModel MatchScheduleAdd(MatchScheduleModel MatchScheduleModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchScheduleMapper MatchSchedulemapper=session.getMapper(MatchScheduleMapper.class);
MatchSchedulemapper.insert(MatchScheduleModel.getMatchSchedule());
MatchScheduleModel.setSucessesValid(true);
MatchScheduleModel.setSucesses("Add Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  MatchScheduleModel.setErrorValid(true);
MatchScheduleModel.setError("Add failed");throw e;
 }
return MatchScheduleModel;
}public MatchScheduleModel MatchScheduleUpdate(MatchScheduleModel MatchScheduleModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchScheduleMapper MatchSchedulemapper=session.getMapper(MatchScheduleMapper.class);
MatchSchedulemapper.updateByPrimaryKey(MatchScheduleModel.getMatchSchedule());
MatchScheduleModel.setSucessesValid(true);
MatchScheduleModel.setSucesses("Update Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  MatchScheduleModel.setErrorValid(true);
MatchScheduleModel.setError("Update failed");throw e;
 }
return MatchScheduleModel;
}public MatchScheduleModel MatchScheduleSelect(MatchScheduleModel MatchScheduleModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchScheduleMapper MatchSchedulemapper=session.getMapper(MatchScheduleMapper.class);
MatchScheduleModel.setListMatchSchedule(MatchSchedulemapper.selectSearch(MatchScheduleModel.getMatchSchedule()));
if(MatchScheduleModel.getListMatchSchedule()!=null&&MatchScheduleModel.getListMatchSchedule().size()>0)
{
MatchScheduleModel.setSearch(true);
}
else
{
 MatchScheduleModel.setErrorValid(true);
MatchScheduleModel.setError("No Results Found");
}
}
catch (Exception e) {
e.printStackTrace();
  MatchScheduleModel.setErrorValid(true);
MatchScheduleModel.setError("Select failed");throw e;
 }
return MatchScheduleModel;
}public List<MatchSchedule> MatchScheduleSelectAll() throws Exception {
SqlSession session = getSqlSession();
List<MatchSchedule> listMatchSchedule= new ArrayList<MatchSchedule>();
try{MatchScheduleMapper MatchSchedulemapper=session.getMapper(MatchScheduleMapper.class);
 listMatchSchedule=MatchSchedulemapper.selectAll();
}
catch (Exception e) {
e.printStackTrace();
throw e;
   }
return listMatchSchedule;
}public MatchScheduleModel MatchScheduleDelete(MatchScheduleModel MatchScheduleModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchScheduleMapper MatchSchedulemapper=session.getMapper(MatchScheduleMapper.class);
MatchSchedulemapper.deleteByPrimaryKey(MatchScheduleModel.getMatchSchedule().getMatchId());
MatchScheduleModel.setSucessesValid(true);
MatchScheduleModel.setSucesses("Delete Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  MatchScheduleModel.setErrorValid(true);
MatchScheduleModel.setError("Delete failed");throw e;
 }
return MatchScheduleModel;
}public MatchScheduleModel MatchScheduleUpdateFetch(MatchScheduleModel MatchScheduleModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchScheduleMapper MatchSchedulemapper=session.getMapper(MatchScheduleMapper.class);
MatchScheduleModel.setMatchSchedule(MatchSchedulemapper.selectByPrimaryKey(MatchScheduleModel.getMatchSchedule().getMatchId()));
MatchScheduleModel.setSucessesValid(true);
MatchScheduleModel.setSucesses("UpdateFetch Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  MatchScheduleModel.setErrorValid(true);
MatchScheduleModel.setError("UpdateFetch failed");throw e;
 }
return MatchScheduleModel;
}@Transactional
public MatchScheduleModel MatchScheduleMassUpdate(MatchScheduleModel MatchScheduleModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchScheduleMapper MatchSchedulemapper=session.getMapper(MatchScheduleMapper.class);
MatchScheduleModel.setSucessesValid(true);
MatchScheduleModel.setSucesses("MassUpdate Sucessful");
for (int i = 0; i < MatchScheduleModel.getListMatchSchedule().size(); i++) {
MatchSchedulemapper.updateByPrimaryKey(MatchScheduleModel.getListMatchSchedule().get(i));
}
}
catch (Exception e) {
e.printStackTrace();
  MatchScheduleModel.setErrorValid(true);
MatchScheduleModel.setError("MassUpdate failed");MatchScheduleModel.setMassUpdate(true);
throw e;
 }
return MatchScheduleModel;
}@Transactional
public MatchScheduleModel MatchScheduleMassAdd(MatchScheduleModel MatchScheduleModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchScheduleMapper MatchSchedulemapper=session.getMapper(MatchScheduleMapper.class);
MatchScheduleModel.setSucessesValid(true);
MatchScheduleModel.setSucesses("MassAdd Sucessful");
for (int i = 0; i < MatchScheduleModel.getListMatchSchedule().size(); i++) {
MatchSchedulemapper.insert(MatchScheduleModel.getListMatchSchedule().get(i));
}
}
catch (Exception e) {
e.printStackTrace();
  MatchScheduleModel.setErrorValid(true);
MatchScheduleModel.setError("MassAdd failed");MatchScheduleModel.setMassAdd(true);
throw e;
 }
return MatchScheduleModel;
}}