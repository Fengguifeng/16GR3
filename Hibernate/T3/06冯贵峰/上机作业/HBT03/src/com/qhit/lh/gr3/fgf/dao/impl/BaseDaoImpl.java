package com.qhit.lh.gr3.fgf.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.fgf.bean.Dept;
import com.qhit.lh.gr3.fgf.bean.Emp;
import com.qhit.lh.gr3.fgf.dao.BaseDao;
import com.qhit.lh.gr3.fgf.utils.HibernateSessionFactory;

public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//1.鑾峰彇session瀵硅薄
		Session session = HibernateSessionFactory.getSession();
		//2.寮�惎浜嬪姟
		Transaction ts = session.beginTransaction();
		//3.鎵ц
		session.save(obj);
		//4.鎻愪氦浜嬪姟
		ts.commit();
		//5.閲婃斁璧勬簮
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		//1.鑾峰彇session瀵硅薄
				Session session = HibernateSessionFactory.getSession();
				//2.寮�惎浜嬪姟
				Transaction ts = session.beginTransaction();
				//3.鎵ц
				session.save(obj);
				//4.鎻愪氦浜嬪姟
				ts.commit();
				//5.閲婃斁璧勬簮
				HibernateSessionFactory.closeSession();
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//1.鑾峰彇session瀵硅薄
				Session session = HibernateSessionFactory.getSession();
				//2.寮�惎浜嬪姟
				Transaction ts = session.beginTransaction();
				//3.鎵ц
				session.save(obj);
				//4.鎻愪氦浜嬪姟
				ts.commit();
				//5.閲婃斁璧勬簮
				HibernateSessionFactory.closeSession();
	}

	@Override
	public List<Object> gerAll(String fromObject) {
		//1.鑾峰彇session瀵硅薄
		Session session = HibernateSessionFactory.getSession();
		//2.寮�惎浜嬪姟
		Transaction ts = session.beginTransaction();
		//3.鑾峰彇鏌ヨ瀵硅薄
		Query query = session.createQuery(fromObject);
		query.list();
		//4.鎻愪氦浜嬪姟
		ts.commit();
		//5.閲婃斁璧勬簮
		HibernateSessionFactory.closeSession();
		return null;
	}



}
