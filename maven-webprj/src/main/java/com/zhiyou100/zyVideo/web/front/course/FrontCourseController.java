package com.zhiyou100.zyVideo.web.front.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zhiyou100.zyVideo.service.FrontCourseSerivce;

@Controller
public class FrontCourseController {

	@Autowired 
	FrontCourseSerivce fcs;
	
	@RequestMapping("front/course/coruseIndex")
	public String courseIndex(String subjectId,Model m){
		m.addAttribute("subject", fcs.getsubject(subjectId));
		m.addAttribute("courses", fcs.getFrontCourse(subjectId));
		m.addAttribute("subjectId", subjectId);
		return "forward:/WEB-INF/front/course/index.jsp";
	}
	
	@RequestMapping("/front/video/index")
	public String videoxIndex(String videoId,String subjectId,Model m){
		m.addAttribute("videoList",fcs.getFrontVideoList(subjectId));
		m.addAttribute("FrontData",fcs.getFrontData(videoId));
		return "forward:/WEB-INF/front/video/index.jsp";
	}
	
	@RequestMapping("/front/video/state.action")
	public void addVideoPlayTimes(String videoId){
		System.out.println("--------------------------------------");
		fcs.addVideoPlayTimes(Integer.parseInt(videoId));
	}
}
