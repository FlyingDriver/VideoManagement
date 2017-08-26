package com.zhiyou100.zyVideo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.zyVideo.mapper.CourseMapper;
import com.zhiyou100.zyVideo.model.Course;
import com.zhiyou100.zyVideo.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseMapper cm;
	
	@Override
	public List<Course> getAllCourse() {
		return cm.getAllCourse();
	}

	@Override
	public boolean addCourse(Course c) {
		if(cm.insertSelective(c)>0){
			return true;
		}
		return false;
	}

	@Override
	public Course getCourseById(Integer id) {
		return cm.selectByPrimaryKey(id);
	}

	@Override
	public boolean updateCourse(Course c) {
		if(cm.updateByPrimaryKeySelective(c)>0){
			return true;
		}
		
		return false;
	}

	@Override
	public boolean deleteCourse(Integer id) {
		if(cm.deleteByPrimaryKey(id)>0){
			return true;
		}
		return false;
	}

}
