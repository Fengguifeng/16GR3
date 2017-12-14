/**
 * 
 */
package com.qhit.lh.gr3.fgf.t1.bean;

/**
 * @author 冯贵峰
 *TODO
 * 2017年12月12日下午1:20:44
 */
public class Dept {
    private int id;
    private String uname;
    private String upassword;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int id, String uname, String upassword) {
		super();
		this.id = id;
		this.uname = uname;
		this.upassword = upassword;
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
}
