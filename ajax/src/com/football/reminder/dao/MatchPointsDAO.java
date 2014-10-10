package com.football.reminder.dao;
import java.util.ArrayList;import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.football.reminder.ivomapper.MatchPointsMapper;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;import com.football.reminder.model.MatchPointsModel;
import com.football.reminder.vo.MatchPoints;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MatchPointsDAO extends BaseDAO implements IMatchPointsDAO {
public MatchPointsModel MatchPointsAdd(MatchPointsModel MatchPointsModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchPointsMapper MatchPointsmapper=session.getMapper(MatchPointsMapper.class);
MatchPointsmapper.insert(MatchPointsModel.getMatchPoints());
MatchPointsModel.setSucessesValid(true);
MatchPointsModel.setSucesses("Add Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  MatchPointsModel.setErrorValid(true);
MatchPointsModel.setError("Add failed");throw e;
 }
return MatchPointsModel;
}public MatchPointsModel MatchPointsUpdate(MatchPointsModel MatchPointsModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchPointsMapper MatchPointsmapper=session.getMapper(MatchPointsMapper.class);
MatchPointsmapper.updateByPrimaryKey(MatchPointsModel.getMatchPoints());
MatchPointsModel.setSucessesValid(true);
MatchPointsModel.setSucesses("Update Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  MatchPointsModel.setErrorValid(true);
MatchPointsModel.setError("Update failed");throw e;
 }
return MatchPointsModel;
}public MatchPointsModel MatchPointsSelect(MatchPointsModel MatchPointsModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchPointsMapper MatchPointsmapper=session.getMapper(MatchPointsMapper.class);
MatchPointsModel.setListMatchPoints(MatchPointsmapper.selectSearch(MatchPointsModel.getMatchPoints()));
if(MatchPointsModel.getListMatchPoints()!=null&&MatchPointsModel.getListMatchPoints().size()>0)
{
MatchPointsModel.setSearch(true);
}
else
{
 MatchPointsModel.setErrorValid(true);
MatchPointsModel.setError("No Results Found");
}
}
catch (Exception e) {
e.printStackTrace();
  MatchPointsModel.setErrorValid(true);
MatchPointsModel.setError("Select failed");throw e;
 }
return MatchPointsModel;
}public List<MatchPoints> MatchPointsSelectAll() throws Exception {
SqlSession session = getSqlSession();
List<MatchPoints> listMatchPoints= new ArrayList<MatchPoints>();
try{MatchPointsMapper MatchPointsmapper=session.getMapper(MatchPointsMapper.class);
 listMatchPoints=MatchPointsmapper.selectAll();
}
catch (Exception e) {
e.printStackTrace();
throw e;
   }
return listMatchPoints;
}public MatchPointsModel MatchPointsDelete(MatchPointsModel MatchPointsModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchPointsMapper MatchPointsmapper=session.getMapper(MatchPointsMapper.class);
MatchPointsmapper.deleteByPrimaryKey(MatchPointsModel.getMatchPoints().getId());
MatchPointsModel.setSucessesValid(true);
MatchPointsModel.setSucesses("Delete Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  MatchPointsModel.setErrorValid(true);
MatchPointsModel.setError("Delete failed");throw e;
 }
return MatchPointsModel;
}public MatchPointsModel MatchPointsUpdateFetch(MatchPointsModel MatchPointsModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchPointsMapper MatchPointsmapper=session.getMapper(MatchPointsMapper.class);
MatchPointsModel.setMatchPoints(MatchPointsmapper.selectByPrimaryKey(MatchPointsModel.getMatchPoints().getId()));
MatchPointsModel.setSucessesValid(true);
MatchPointsModel.setSucesses("UpdateFetch Sucessful");
}
catch (Exception e) {
e.printStackTrace();
  MatchPointsModel.setErrorValid(true);
MatchPointsModel.setError("UpdateFetch failed");throw e;
 }
return MatchPointsModel;
}@Transactional
public MatchPointsModel MatchPointsMassUpdate(MatchPointsModel MatchPointsModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchPointsMapper MatchPointsmapper=session.getMapper(MatchPointsMapper.class);
MatchPointsModel.setSucessesValid(true);
MatchPointsModel.setSucesses("MassUpdate Sucessful");
for (int i = 0; i < MatchPointsModel.getListMatchPoints().size(); i++) {
MatchPointsmapper.updateByPrimaryKey(MatchPointsModel.getListMatchPoints().get(i));
}
}
catch (Exception e) {
e.printStackTrace();
  MatchPointsModel.setErrorValid(true);
MatchPointsModel.setError("MassUpdate failed");MatchPointsModel.setMassUpdate(true);
throw e;
 }
return MatchPointsModel;
}@Transactional
public MatchPointsModel MatchPointsMassAdd(MatchPointsModel MatchPointsModel) throws Exception {
SqlSession session = getSqlSession();
try{MatchPointsMapper MatchPointsmapper=session.getMapper(MatchPointsMapper.class);
MatchPointsModel.setSucessesValid(true);
MatchPointsModel.setSucesses("MassAdd Sucessful");
for (int i = 0; i < MatchPointsModel.getListMatchPoints().size(); i++) {
MatchPointsmapper.insert(MatchPointsModel.getListMatchPoints().get(i));
}
}
catch (Exception e) {
e.printStackTrace();
  MatchPointsModel.setErrorValid(true);
MatchPointsModel.setError("MassAdd failed");MatchPointsModel.setMassAdd(true);
throw e;
 }
return MatchPointsModel;
}}