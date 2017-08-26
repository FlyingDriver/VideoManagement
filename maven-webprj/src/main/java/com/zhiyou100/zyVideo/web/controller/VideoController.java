package com.zhiyou100.zyVideo.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhiyou100.zyVideo.model.Course;
import com.zhiyou100.zyVideo.model.Speaker;
import com.zhiyou100.zyVideo.model.Video;
import com.zhiyou100.zyVideo.service.CourseService;
import com.zhiyou100.zyVideo.service.SpeakerService;
import com.zhiyou100.zyVideo.service.VideoService;
import com.zhiyou100.zyVideo.util.Page;

@Controller
public class VideoController {
	
	@Autowired
	VideoService vs;
	@Autowired
	SpeakerService ss;
	@Autowired
	CourseService cs;
	 
	
	
	@RequestMapping("/videoList")
	public String videoList(Model m,
			@RequestParam(value="title",required=false,defaultValue="")String title,
			@RequestParam(value="speaker",required=false,defaultValue="") String speaker,
			@RequestParam(value="course",required=false,defaultValue="") String course,
			@RequestParam(value="page",required=false,defaultValue="1")Integer page){
		
		m.addAttribute("spe",speaker);
		m.addAttribute("tit",title);
		m.addAttribute("cou",course);
		List<Speaker> allSpeaker=ss.getAllspeaker();
		List<Course> allCourse = cs.getAllCourse();
		Page<Video> allVideo = vs.getAllVideo(title, speaker, course,page);
		allVideo.setTotal(vs.getVideoCount(title, speaker, course));
		m.addAttribute("page",allVideo);
		m.addAttribute("allSpeaker",allSpeaker);
		m.addAttribute("allCourse",allCourse);
		return "video/videoList";
	}
	
	@RequestMapping(value="/addVideo",method=RequestMethod.GET)
	public String addVideo(Model m){
		List<Speaker> allSpeaker=ss.getAllspeaker();
		List<Course> allCourse = cs.getAllCourse();
		m.addAttribute("addSpeaker",allSpeaker);
		m.addAttribute("addCourse",allCourse);
		return "video/addVideo";
	}
	
	@RequestMapping(value="/addVideo",method=RequestMethod.POST)
	public String addVideo(Video v){
		vs.addVideo(v);
		return "forward:/videoList.action";
	}
	
	@RequestMapping(value="/updateVideo",method=RequestMethod.GET)
	public String updateVideo(int id, Model m){
		List<Speaker> allSpeaker=ss.getAllspeaker();
		List<Course> allCourse = cs.getAllCourse();
		m.addAttribute("video", vs.getVideoById(id));
		m.addAttribute("allSpeaker",allSpeaker);
		m.addAttribute("allCourse",allCourse);
		return "/video/updateVideo";
	}
	@RequestMapping(value="/updateVideo",method=RequestMethod.POST)
	public String updateVideo(Video v){
		vs.updateVideo(v);
		
		return "forward:/videoList.action";
	}
	@RequestMapping("/deleteVideo")
	public String deleteVideo(Integer id){
		vs.deleteVideo(id);
		return "forward:/videoList.action";
	}
	@RequestMapping("/batchesDelete.action")
	public String batchesDelete(@RequestBody String[] array){
		String str="";
		for(int i=0;i<array.length;i++){
			if(i==(array.length-1)){
				str+=array[i];
			}else{
				str+=array[i]+",";
			}
		}
		vs.batchesDelete(str);
		return "forward:/videoList.action";
		
	}
}
