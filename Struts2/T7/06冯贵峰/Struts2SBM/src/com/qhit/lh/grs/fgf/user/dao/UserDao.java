package com.qhit.lh.grs.fgf.user.dao;

import java.util.List;

import com.qhit.lh.grs.fgf.user.bean.User;

public interface UserDao {

	/**
	 * @param userName
	 * @param userPassword
	 * @return
	 * 登录
	 */
	User doLogin(String userName, String userPassword);
	
	/**
	 * @param user
	 * @return
	 * 添加用户
	 */
	int addUser(User user);
	
	/**
	 * @return
	 * 查询所有
	 * @throws Exception 
	 */
	List<User> getAll() throws Exception;
}