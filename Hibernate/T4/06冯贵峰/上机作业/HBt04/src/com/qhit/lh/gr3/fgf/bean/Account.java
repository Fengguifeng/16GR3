package com.qhit.lh.gr3.fgf.bean;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */

public class Account implements java.io.Serializable {

	// Fields

	private Integer id;
	private String aname;
	private String apassword;

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** full constructor */
	public Account(String aname, String apassword) {
		this.aname = aname;
		this.apassword = apassword;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApassword() {
		return this.apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}

}