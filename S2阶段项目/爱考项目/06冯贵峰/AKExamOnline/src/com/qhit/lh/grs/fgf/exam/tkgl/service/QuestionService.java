﻿/**
 * 
 */
package com.qhit.lh.grs.fgf.exam.tkgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.grs.fgf.exam.common.bean.PageBean;
import com.qhit.lh.grs.fgf.exam.kmgl.bean.Course;
import com.qhit.lh.grs.fgf.exam.tkgl.bean.WrittenQuestion;

 
public interface QuestionService {
	
	/**
	 * @param csId
	 * @param qtype
	 * @param degree
	 * 获取试题集合
	 * @return
	 */
	public List<WrittenQuestion> getQuestionsByType(int csId,String qtype,String degree);
	
	/**
	 * @param csId
	 * @param type
	 * @param degree
	 * @return
	 * 获取试题数量
	 */
	public int getQuestionsMax(int csId,String type,String degree);
	
	/**
	 * @param parameter
	 * @return
	 */
	public List<Course> getCourseInfo(Map parameter);
	
	/**
	 * @return
	 * 笔试题列表分页数据
	 */
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean,
			Course course,
			int pageIndex);
	
	/**
	 * @param writtenQuestion
	 * 添加笔试题
	 */
	public void addWrittenQuestion(WrittenQuestion writtenQuestion);
	
	/**
	 * @param writtenQuestion
	 * @return
	 * 根据ID查询试题
	 */
	public WrittenQuestion getWrittenQuestionById(WrittenQuestion writtenQuestion);
	
	/**
	 * @param writtenQuestion
	 * 更新数据
	 */
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion);
	
	/**
	 * @param writtenQuestion
	 * 批量导入试题
	 */
	public void inprotWrittenQuestion(List<WrittenQuestion> listwritten);
}
