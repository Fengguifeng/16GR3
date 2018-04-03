/**
 * 
 */
package com.qhit.lh.grs.fgf.exam.common.dao;

import org.hibernate.Session;

import com.qhit.lh.grs.fgf.exam.common.utils.HibernateSessionFactory;

 
public class BaseDao {
	
	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}
}
