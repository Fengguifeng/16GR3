package com.qhit.struts.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.qhit.struts.bean.User;

public class UserAction extends ActionSupport {
	private User user;

	public void validate() {
		if(user == null) {
			super.addFieldError("user.username","没填写信息");
		}else {
			if(user.getUsername() == "" && user.getUsername() == null) {
				super.addFieldError("user.username",getText("uname.empty"));
			}
		}
		super.validate();
	}
	public String execute() throws Exception {
		return null;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
