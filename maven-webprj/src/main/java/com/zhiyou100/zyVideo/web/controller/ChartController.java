package com.zhiyou100.zyVideo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.zyVideo.service.ChartsService;


@Controller
public class ChartController {

	@Autowired
	ChartsService cs;
	
	@RequestMapping("showChart")
	public String showChart(Model m){		
		m.addAttribute("dataInfo",cs.getData());
		return "chart";
	}
}
