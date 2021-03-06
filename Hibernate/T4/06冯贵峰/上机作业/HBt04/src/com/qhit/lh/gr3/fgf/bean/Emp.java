package com.qhit.lh.gr3.fgf.bean;



/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String ename;
	private String sex;
	private String birthday;
	private Integer deptid;
	
	//多对一
	private Dept dept;

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** minimal constructor */
	public Emp(String ename, String sex, String birthday) {
		this.ename = ename;
		this.sex = sex;
		this.birthday = birthday;
	}

	/** full constructor */
	public Emp(String ename, String sex, String birthday, Integer deptid) {
		this.ename = ename;
		this.sex = sex;
		this.birthday = birthday;
		this.deptid = deptid;
	}

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getDeptid() {
		return this.deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

}