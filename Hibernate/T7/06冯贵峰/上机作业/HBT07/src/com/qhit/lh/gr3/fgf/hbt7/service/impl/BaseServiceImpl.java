package com.qhit.lh.gr3.fgf.hbt7.service.impl;

import java.util.List;

import com.qhit.lh.gr3.fgf.hbt7.dao.BaseDao;
import com.qhit.lh.gr3.fgf.hbt7.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.fgf.hbt7.service.BaseService;


public class BaseServiceImpl implements BaseService {
    private BaseDao baseDao = new BaseDaoImpl();

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	@Override
	public List<Object> gerAll(String fromObject) {
		// TODO Auto-generated method stub
		return baseDao.gerAll(fromObject);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.fgf.service.BaseService#GetObjectById(java.lang.Class, int)
	 */
	@Override
	public Object GetObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.GetObjectById(clazz, id);
	}
}
