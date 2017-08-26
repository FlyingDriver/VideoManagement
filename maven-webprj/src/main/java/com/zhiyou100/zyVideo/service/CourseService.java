package com.zhiyou100.zyVideo.service;

import java.util.List;

import com.zhiyou100.zyVideo.model.Course;

public interface CourseService {

	List<Course> getAllCourse();

	boolean addCourse(Course c);

	Course getCourseById(Integer id);

	boolean updateCourse(Course c);

	boolean deleteCourse(Integer id);
}
