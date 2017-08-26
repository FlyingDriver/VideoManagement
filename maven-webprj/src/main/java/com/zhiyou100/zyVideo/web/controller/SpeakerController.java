package com.zhiyou100.zyVideo.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.zhiyou100.zyVideo.model.Speaker;
import com.zhiyou100.zyVideo.service.SpeakerService;
import com.zhiyou100.zyVideo.util.Page;

@Controller
public class SpeakerController {

	@Autowired
	SpeakerService ss;
	
	@RequestMapping("/speakerList")
	public String getAllSpeaker(Model m,
			@RequestParam(value="page",required=false,defaultValue="1")Integer page,
			@RequestParam(value="name",required=false,defaultValue="")String name,
			@RequestParam(value="job",required=false,defaultValue="")String job){
		
		Page<Speaker> speakers = ss.getSpeakers(job,name,page);
		speakers.setSize(5);
		speakers.setPage(page);
		speakers.setTotal(ss.getSpeakerCount(job,name));
		m.addAttribute("job", job);
		m.addAttribute("name", name);
		m.addAttribute("page", speakers);
		return "/speaker/speakerList";
	}
	
	@RequestMapping(value="/addSpeaker",method=RequestMethod.GET)
	public String addSpeaker(){
		return "speaker/addSpeaker";
	}
	
	@RequestMapping(value="/addSpeaker",method=RequestMethod.POST)
	public String addSpeaker(Speaker s){
		ss.addSpeaker(s);
		return "forward:/speakerList.action";
	}
	@RequestMapping(value="/updateSpeaker", method=RequestMethod.GET)
	public String updateSpeaker(Integer id ,Model m){
		m.addAttribute("speaker",ss.getSpeakerById(id));
		return "speaker/updateSpeaker";
	}
	
	@RequestMapping(value="/updateSpeaker", method=RequestMethod.POST)
	public String updateSpeaker(Speaker s){
		ss.updateSpeaker(s);
		return "forward:/speakerList.action";
	}
	
	@RequestMapping("/deleteSpeaker.action")
	public String deleteSpeaker(Integer id){
		
		ss.deleteSpeaker(id);
		return "forward:/speakerList.action";
	}
	
}
