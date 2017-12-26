package com.qhit.lh.gr3.fgf.bean;

public class Dept {
   private int eid;
   private String deptname;
   private String address;
public Dept() {
	super();
	// TODO Auto-generated constructor stub
}
public Dept(int eid, String deptname, String address) {
	super();
	this.eid = eid;
	this.deptname = deptname;
	this.address = address;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
