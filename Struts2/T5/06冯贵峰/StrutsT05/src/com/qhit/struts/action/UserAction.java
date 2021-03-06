package com.qhit.struts.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.qhit.struts.bean.User;
import com.qhit.struts.service.UserService;
import com.qhit.struts.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport{
	private User user;
	private List<User> users;
	private UserService uService = new UserServiceImpl();
	
	/**
	 * @return
	 * 添加
	 */
	public String add()  {
		try{
			uService.addUser(user);
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
		return "toAll";
		
	}
	
	/**
	 * @return
	 * 删除
	 */
	public String delete(){
		try {
			uService.deleteUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		return "toAll";
	}
	
	/**
	 * @return
	 * 先查询用户信息，再跳转修改页面
	 */
	public String toUpdate(){
		try {
			user = uService.getUserById(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		return "toUpdate";
		
	}
	
	/**
	 * @return
	 * 修改用户信息
	 */

	public String update(){
		try {
			uService.updateUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		return "toAll";
		
	}
	
	/**
	 * @return
	 * 查询所有用户
	 */
	public String getAll(){

		try {
			users = uService.getAllUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		return "listUser";
		
	}
    public User getUser(){
		return user;
    	
    }
    public void setUser(User user){
    	this.user = user;
    }
    public List<User> getUsers(){
		return users;
    	
    }
    public void setUsers(List<User> users){
    	this.users = users;
    }

	
}
