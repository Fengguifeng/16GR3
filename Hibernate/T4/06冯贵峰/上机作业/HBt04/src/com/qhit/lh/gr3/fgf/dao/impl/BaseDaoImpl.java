package com.qhit.lh.gr3.fgf.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.fgf.dao.BaseDao;
import com.qhit.lh.gr3.fgf.util.HibernateSessionFactory;


public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//1.获取session对象
		Session session = HibernateSessionFactory.getSession();
		//2.开启事务
		Transaction ts = session.beginTransaction();
		//3.执行
		session.save(obj);
		//4.提交事务
		ts.commit();
		//5.释放资源
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		//1.获取session对象
				Session session = HibernateSessionFactory.getSession();
				//2.开启事务
				Transaction ts = session.beginTransaction();
				//3.执行
				session.delete(obj);
				//4.提交事务
				ts.commit();
				//5.释放资源
				HibernateSessionFactory.closeSession();
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//1.获取session对象
				Session session = HibernateSessionFactory.getSession();
				//2.开启事务
				Transaction ts = session.beginTransaction();
				//3.执行
				session.update(obj);
				//4.提交事务
				ts.commit();
				//5.释放资源
				HibernateSessionFactory.closeSession();
	}

	@Override
	public List<Object> gerAll(String fromObject) {
		//1.获取session对象
		Session session = HibernateSessionFactory.getSession();
		//2.开启事务
		Transaction ts = session.beginTransaction();
		//3.获取查询对象
		Query query = session.createQuery(fromObject);
		List<Object> list = query.list();
		//4.提交事务
		ts.commit();
		//5.释放资源
		HibernateSessionFactory.closeSession();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.fgf.dao.BaseDao#GetObjectById(java.lang.Class, int)
	 */
	@Override
	public Object GetObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		//1.获取session对象
				Session session = HibernateSessionFactory.getSession();
				//2.开启事务
				Transaction ts = session.beginTransaction();
				//3.获取查询对象
				Object obj=session.get(clazz, id);
				//4.提交事务
				ts.commit();
				//5.释放资源
				HibernateSessionFactory.closeSession();
		     return obj;
	}

}
