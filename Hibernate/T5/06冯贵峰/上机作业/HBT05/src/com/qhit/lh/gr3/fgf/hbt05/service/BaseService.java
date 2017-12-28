package com.qhit.lh.gr3.fgf.hbt05.service;

import java.util.List;

/**
 * @author 冯贵峰
 * TODO
 * 2017年12月12日上午11:16:38
 */
public interface BaseService {
	
    public void add(Object obj);
	
	public void delete(Object obj);
	
	public void update(Object obj);
	
	public List<Object> getAll(String fromObject);
	
	public Object getObjectById(Class clazz,int id);

}
