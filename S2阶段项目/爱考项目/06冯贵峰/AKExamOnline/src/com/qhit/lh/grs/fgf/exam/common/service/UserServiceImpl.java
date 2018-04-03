/**
 * 
 */
package com.qhit.lh.grs.fgf.exam.common.service;

import com.qhit.lh.grs.fgf.exam.common.bean.User;
import com.qhit.lh.grs.fgf.exam.common.dao.UserDao;
import com.qhit.lh.grs.fgf.exam.common.dao.UserDaoImpl;
 
public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
