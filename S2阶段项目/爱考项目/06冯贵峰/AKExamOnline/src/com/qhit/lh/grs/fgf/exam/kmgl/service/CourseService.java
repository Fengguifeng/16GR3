/**
 * 
 */
package com.qhit.lh.grs.fgf.exam.kmgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.grs.fgf.exam.kmgl.bean.Course;

 
public interface CourseService {
	
	/**
	 * @param parameter
	 * @return
	 */
	public List<Course> getCourseList(Map<String, Object> parameter);
}
