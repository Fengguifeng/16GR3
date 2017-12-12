package com.qhit.lh.gr3.fgf.t1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3.fgf.t1.bean.User;
import com.qhit.lh.gr3.fgf.t1.service.BaseService;
import com.qhit.lh.gr3.fgf.t1.service.impl.BaseServiceImpl;

/**
 * @author 冯贵峰
 *TODO
 * 2017年12月12日下午1:05:07
 */
public class UserTest {
    private BaseService baseService = new BaseServiceImpl();
	@Test
	public void addUser() {
		//声明实例化对象
		User user = new User();
		user.setUname("小明");
		user.setUpassword("123456");
		user.setBirthday("1998-02-02");
		user.setSex("m");
		user.setEnable(1);
		//数据操作
		baseService.add(user);
		
	}
	@Test
	public void deleteUser(){
		//声明并实例化对象
		User user = new User();
		user.setId(6);
		//操作对象
		baseService.delete(user);
	}
	@Test
	public void update(){
		//声明实例化对象
		User user = new User();
		user.setUname("");
		user.setUpassword("");
		user.setBirthday("");
		user.setSex("");
		user.setEnable(0);
		//数据操作
		baseService.update(user);
	}
	@Test
	public void getAll(){
		List<Object> list = baseService.gerAll("from user");
		for(Object object : list){
			User user = (User) object;
			System.out.println(user.toString());
		}
	}

}
