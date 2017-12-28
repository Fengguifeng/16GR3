package com.qhit.lh.gr3.fgf.hbt05.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String deptname;
	private String address;
	
	private Set<Emp> emps = new HashSet<Emp>();

	// Constructors

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	public Dept(Integer eid, String deptname, String address, Set<Emp> emps) {
		super();
		this.eid = eid;
		this.deptname = deptname;
		this.address = address;

	}

	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(String deptname, String address) {
		this.deptname = deptname;
		this.address = address;
	}

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}