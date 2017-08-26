package com.zhiyou100.zyVideo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhiyou100.zyVideo.model.Course;
import com.zhiyou100.zyVideo.service.CourseService;
import com.zhiyou100.zyVideo.service.SubjectService;

@Controller
public class CourseController {
	
	@Autowired 
	CourseService cs;
	@Autowired 
	SubjectService ss;
	
	@RequestMapping("/courseList")
	public String getAllCourse(Model m){
		m.addAttribute("course",cs.getAllCourse());
		return "/course/courseList";
	}
	
	@RequestMapping(value="/addCourse", method=RequestMethod.GET)
	public String addCourse(Model m){
		m.addAttribute("subject",(ss.getAllSubject()));
		return "/course/addCourse";
	}
	@RequestMapping(value="/addCourse", method=RequestMethod.POST)
	public String addCourse(Course c){
		System.out.println(c);
		cs.addCourse(c);
		return "forward:/courseList.action";
	}
	
	@RequestMapping(value="/updateCourse", method=RequestMethod.GET)
	public String updateCourse(Integer id,Model m){
		m.addAttribute("course", cs.getCourseById(id));
		m.addAttribute("subject",ss.getAllSubject());
		return "/course/updateCourse";
	}
	
	@RequestMapping(value="/updateCourse", method=RequestMethod.POST)
	public String updateCourse(Course c){
		cs.updateCourse(c);
		return "forward:/courseList.action";
	}
	
	@RequestMapping("/deleteCourse")
	public String deleteCourse(Integer id){
		cs.deleteCourse(id);
		return "forward:/courseList.action";
	}
	
}
