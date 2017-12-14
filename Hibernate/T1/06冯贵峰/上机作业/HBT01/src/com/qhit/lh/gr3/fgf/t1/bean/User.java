package com.qhit.lh.gr3.fgf.t1.bean;

public class User {
   private int id;
   private String uname;
   private String upassword;
   private String birthday;
   private String sex;
   private int enable;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String uname, String upassword, String birthday, String sex, int enable) {
	super();
	this.id = id;
	this.uname = uname;
	this.upassword = upassword;
	this.birthday = birthday;
	this.sex = sex;
	this.enable = enable;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpassword() {
	return upassword;
}
public void setUpassword(String upassword) {
	this.upassword = upassword;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getEnable() {
	return enable;
}
public void setEnable(int enable) {
	this.enable = enable;
}
} 
