package com.qhit.lh.gr3.fgf.hbt6.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String uname;
	private String upassword;
	
	private Set<Roles> roles=new HashSet(0);

	// Constructors

	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String uname, String upassword) {
		this.uname = uname;
		this.upassword = upassword;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return this.upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

}