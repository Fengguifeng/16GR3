package com.qhit.lh.gr3.fgf.dao;

import java.util.List;

public interface BaseDao {
   /**
 * @param obj
 * 增
 */
public void add(Object obj);
   /**
 * @param obj
 * 删
 */
public void delete(Object obj);
   /**
 * @param obj
 * 改
 */
public void update(Object obj);
/**
 * 查
 */
public List<Object> gerAll(String fromObject);
/**
 * @param clazz
 * @param id
 * @return
 */
public  Object GetObjectById(Class clazz,int id);
}
