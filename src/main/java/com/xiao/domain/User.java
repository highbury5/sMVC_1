package com.xiao.domain;

import java.util.Date;

public class User {
  private int userID;
  private String userName;
  private String passWord;
  private int point;
  private String lastIP;
  private Date lastVisit;
public int getUserID() {
	return userID;
}
public void setUserID(int userID) {
	this.userID = userID;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public int getPoint() {
	return point;
}
public void setPoint(int point) {
	this.point = point;
}
public String getLastIP() {
	return lastIP;
}
public void setLastIP(String lastIP) {
	this.lastIP = lastIP;
}
public Date getLastVisit() {
	return lastVisit;
}
public void setLastVisit(Date lastVisit) {
	this.lastVisit = lastVisit;
}
  
  
}
