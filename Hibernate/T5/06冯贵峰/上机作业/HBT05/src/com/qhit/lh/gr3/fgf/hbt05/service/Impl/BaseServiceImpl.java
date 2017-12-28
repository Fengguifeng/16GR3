package com.qhit.lh.gr3.fgf.hbt05.service.Impl;

import java.util.List;

import com.qhit.lh.gr3.fgf.hbt05.dao.BaseDao;
import com.qhit.lh.gr3.fgf.hbt05.dao.Impl.BaseDaoImpl;
import com.qhit.lh.gr3.fgf.hbt05.service.BaseService;



/**
 * @author feng
 * TODO
 * 2017年12月12日上午11:16:36
 */
public class BaseServiceImpl implements BaseService {
    private BaseDao baseDao=new BaseDaoImpl();
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
	public List<Object> getAll(String fromObject) {
		// TODO Auto-generated method stub
		return baseDao.getAll(fromObject);
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

}
