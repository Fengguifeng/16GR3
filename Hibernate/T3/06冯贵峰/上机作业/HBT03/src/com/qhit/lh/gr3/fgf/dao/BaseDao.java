package com.qhit.lh.gr3.fgf.dao;

import java.util.List;

import com.qhit.lh.gr3.fgf.bean.Dept;
import com.qhit.lh.gr3.fgf.bean.Emp;

public interface BaseDao {
   /**
 * @param obj
 * 澧�
 */
public void add(Object obj);
   /**
 * @param obj
 * 鍒�
 */
public void delete(Object obj);
   /**
 * @param obj
 * 鏀�
 */
public void update(Object obj);
/**
 * 鏌�
 */
public List<Object> gerAll(String fromObject);

}
