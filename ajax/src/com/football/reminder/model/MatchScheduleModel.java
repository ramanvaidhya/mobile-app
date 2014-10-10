package com.football.reminder.model;
import com.football.reminder.vo.MatchSchedule;
import java.util.ArrayList;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
public  class MatchScheduleModel   {
private MatchSchedule MatchSchedule;
private List<MatchSchedule> listMatchSchedule= new ArrayList<MatchSchedule>();
private boolean search=false;
private boolean add=false;
private boolean update=false;
private boolean delete=false;
private boolean errorValid=false;
private String error;
private boolean sucessesValid=false;
private String sucesses;
private boolean massAdd=false;
private boolean massUpdate=false;
private List<String> listError = new ArrayList<String>();
private MultipartFile excelUpload;
public MatchSchedule getMatchSchedule() {
	return MatchSchedule;
}
public void setMatchSchedule(MatchSchedule matchSchedule) {
	MatchSchedule = matchSchedule;
}
public List<MatchSchedule> getListMatchSchedule() {
	return listMatchSchedule;
}
public void setListMatchSchedule(List<MatchSchedule> listMatchSchedule) {
	this.listMatchSchedule = listMatchSchedule;
}
public boolean isSearch() {
	return search;
}
public void setSearch(boolean search) {
	this.search = search;
}
public boolean isAdd() {
	return add;
}
public void setAdd(boolean add) {
	this.add = add;
}
public boolean isUpdate() {
	return update;
}
public void setUpdate(boolean update) {
	this.update = update;
}
public boolean isDelete() {
	return delete;
}
public void setDelete(boolean delete) {
	this.delete = delete;
}
public boolean isErrorValid() {
	return errorValid;
}
public void setErrorValid(boolean errorValid) {
	this.errorValid = errorValid;
}
public String getError() {
	return error;
}
public void setError(String error) {
	this.error = error;
}
public boolean isSucessesValid() {
	return sucessesValid;
}
public void setSucessesValid(boolean sucessesValid) {
	this.sucessesValid = sucessesValid;
}
public String getSucesses() {
	return sucesses;
}
public void setSucesses(String sucesses) {
	this.sucesses = sucesses;
}
public boolean isMassAdd() {
	return massAdd;
}
public void setMassAdd(boolean massAdd) {
	this.massAdd = massAdd;
}
public boolean isMassUpdate() {
	return massUpdate;
}
public void setMassUpdate(boolean massUpdate) {
	this.massUpdate = massUpdate;
}
public List<String> getListError() {
	return listError;
}
public void setListError(List<String> listError) {
	this.listError = listError;
}
public MultipartFile getExcelUpload() {
	return excelUpload;
}
public void setExcelUpload(MultipartFile excelUpload) {
	this.excelUpload = excelUpload;
}

}