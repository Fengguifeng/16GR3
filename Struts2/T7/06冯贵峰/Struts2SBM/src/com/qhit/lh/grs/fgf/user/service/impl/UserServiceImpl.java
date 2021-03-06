package com.qhit.lh.grs.fgf.user.service.impl;

import java.util.List;

import com.qhit.lh.grs.fgf.user.bean.User;
import com.qhit.lh.grs.fgf.user.dao.UserDao;
import com.qhit.lh.grs.fgf.user.dao.impl.UserDaoImpl;
import com.qhit.lh.grs.fgf.user.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();
	@Override
	public User doLogin(String userName,String userPassword){
		return userDao.doLogin(userName, userPassword);
	}

	@Override
	public int addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public List<User> getAll() throws Exception {
		return userDao.getAll();
	}

}
