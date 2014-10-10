package com.football.reminder.dao;
import java.util.ArrayList;import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.football.reminder.ivomapper.MatchReminderMapper;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;import com.football.reminder.model.MatchReminderModel;
import com.football.reminder.vo.MatchReminder;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MatchReminderDAO extends BaseDAO implements IMatchReminderDAO {
public MatchReminderModel MatchReminderAdd(MatchReminderModel MatchReminderModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchReminderMapper MatchRemindermapper=session.getMapper(MatchReminderMapper.class);
MatchRemindermapper.insert(MatchReminderModel.getMatchReminder());
MatchReminderModel.setSucessesValid(true);
MatchReminderModel.setSucesses("Add Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  MatchReminderModel.setErrorValid(true);
MatchReminderModel.setError("Add failed");throw e;
 }
return MatchReminderModel;
}public MatchReminderModel MatchReminderUpdate(MatchReminderModel MatchReminderModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchReminderMapper MatchRemindermapper=session.getMapper(MatchReminderMapper.class);
MatchRemindermapper.updateByPrimaryKey(MatchReminderModel.getMatchReminder());
MatchReminderModel.setSucessesValid(true);
MatchReminderModel.setSucesses("Update Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  MatchReminderModel.setErrorValid(true);
MatchReminderModel.setError("Update failed");throw e;
 }
return MatchReminderModel;
}public MatchReminderModel MatchReminderSelect(MatchReminderModel MatchReminderModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchReminderMapper MatchRemindermapper=session.getMapper(MatchReminderMapper.class);
MatchReminderModel.setListMatchReminder(MatchRemindermapper.selectSearch(MatchReminderModel.getMatchReminder()));
if(MatchReminderModel.getListMatchReminder()!=null&&MatchReminderModel.getListMatchReminder().size()>0)
{
MatchReminderModel.setSearch(true);
}
else
{
 MatchReminderModel.setErrorValid(true);
MatchReminderModel.setError("No Results Found");
}
}
catch (Exception e) {
e.printStackTrace();
  MatchReminderModel.setErrorValid(true);
MatchReminderModel.setError("Select failed");throw e;
 }
return MatchReminderModel;
}public List<MatchReminder> MatchReminderSelectAll() throws Exception {
SqlSession session = getSqlSession();
List<MatchReminder> listMatchReminder= new ArrayList<MatchReminder>();
try{MatchReminderMapper MatchRemindermapper=session.getMapper(MatchReminderMapper.class);
 listMatchReminder=MatchRemindermapper.selectAll();
}
catch (Exception e) {
e.printStackTrace();
throw e;
   }
return listMatchReminder;
}public MatchReminderModel MatchReminderDelete(MatchReminderModel MatchReminderModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchReminderMapper MatchRemindermapper=session.getMapper(MatchReminderMapper.class);
MatchRemindermapper.deleteByPrimaryKey(MatchReminderModel.getMatchReminder().getId());
MatchReminderModel.setSucessesValid(true);
MatchReminderModel.setSucesses("Delete Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  MatchReminderModel.setErrorValid(true);
MatchReminderModel.setError("Delete failed");throw e;
 }
return MatchReminderModel;
}public MatchReminderModel MatchReminderUpdateFetch(MatchReminderModel MatchReminderModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchReminderMapper MatchRemindermapper=session.getMapper(MatchReminderMapper.class);
MatchReminderModel.setMatchReminder(MatchRemindermapper.selectByPrimaryKey(MatchReminderModel.getMatchReminder().getId()));
MatchReminderModel.setSucessesValid(true);
MatchReminderModel.setSucesses("UpdateFetch Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  MatchReminderModel.setErrorValid(true);
MatchReminderModel.setError("UpdateFetch failed");throw e;
 }
return MatchReminderModel;
}@Transactional
public MatchReminderModel MatchReminderMassUpdate(MatchReminderModel MatchReminderModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchReminderMapper MatchRemindermapper=session.getMapper(MatchReminderMapper.class);
MatchReminderModel.setSucessesValid(true);
MatchReminderModel.setSucesses("MassUpdate Sucessful");
for (int i = 0; i < MatchReminderModel.getListMatchReminder().size(); i++) {
MatchRemindermapper.updateByPrimaryKey(MatchReminderModel.getListMatchReminder().get(i));
}
}
catch (Exception e) {
e.printStackTrace();
  MatchReminderModel.setErrorValid(true);
MatchReminderModel.setError("MassUpdate failed");MatchReminderModel.setMassUpdate(true);
throw e;
 }
return MatchReminderModel;
}@Transactional
public MatchReminderModel MatchReminderMassAdd(MatchReminderModel MatchReminderModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchReminderMapper MatchRemindermapper=session.getMapper(MatchReminderMapper.class);
MatchReminderModel.setSucessesValid(true);
MatchReminderModel.setSucesses("MassAdd Sucessful");
for (int i = 0; i < MatchReminderModel.getListMatchReminder().size(); i++) {
MatchRemindermapper.insert(MatchReminderModel.getListMatchReminder().get(i));
}
}
catch (Exception e) {
e.printStackTrace();
  MatchReminderModel.setErrorValid(true);
MatchReminderModel.setError("MassAdd failed");MatchReminderModel.setMassAdd(true);
throw e;
 }
return MatchReminderModel;
}}