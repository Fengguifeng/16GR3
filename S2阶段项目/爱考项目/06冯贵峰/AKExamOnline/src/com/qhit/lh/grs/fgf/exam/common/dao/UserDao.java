/**
 * 
 */
package com.qhit.lh.grs.fgf.exam.common.dao;

import com.qhit.lh.grs.fgf.exam.common.bean.User;

 
public interface UserDao {
	
	/**
	 * @param user
	 * @return
	 * 登录
	 */
	public User login(User user);
}
