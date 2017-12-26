package com.qhit.lh.gr3.fgf.bean;

public class Account {
   private int id;
   private String aname;
   private String apassword;
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(int id, String aname, String apassword) {
	super();
	this.id = id;
	this.aname = aname;
	this.apassword = apassword;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public String getApassword() {
	return apassword;
}
public void setApassword(String apassword) {
	this.apassword = apassword;
}
}
