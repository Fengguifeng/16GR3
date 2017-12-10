package com.qhit.struts.service.impl;

import java.util.List;

import com.qhit.struts.bean.User;
import com.qhit.struts.dao.UserDao;
import com.qhit.struts.dao.impl.UserDaoImpl;
import com.qhit.struts.service.UserService;

public class UserServiceImpl implements UserService {
     //声明一个全userdao对象
	private UserDao userDao = new UserDaoImpl();
	@Override
	public int addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public int deleteUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.deleteUser(user);
	}

	@Override
	public int updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	@Override
	public List<User> getAllUser() throws Exception {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

	@Override
	public User getUserById(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.getUserById(user);
	}

}
