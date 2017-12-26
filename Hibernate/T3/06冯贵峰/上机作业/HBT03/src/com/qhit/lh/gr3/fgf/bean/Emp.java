package com.qhit.lh.gr3.fgf.bean;

public class Emp {
    private int eid;
    private String ename;
    private String sex;
    private String birthday;
    private int deptid;
    
    //多对一关联
    private Dept dept;
    
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eid, String ename, String sex, String birthday, int deptid) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.birthday = birthday;
		this.deptid = deptid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
} 
