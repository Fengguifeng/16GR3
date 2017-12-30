package com.qhit.lh.gr3.fgf.hbt6.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Roles entity. @author MyEclipse Persistence Tools
 */

public class Roles implements java.io.Serializable {

	// Fields

	private Integer rid;
	private String rolename;
	private String memo;

	private Set<User> users=new HashSet(0);
	// Constructors

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	/** default constructor */
	public Roles() {
	}

	/** full constructor */
	public Roles(String rolename, String memo) {
		this.rolename = rolename;
		this.memo = memo;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}