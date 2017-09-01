package com.zhiyou100.zyVideo.web.front.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.zyVideo.model.Course;
import com.zhiyou100.zyVideo.model.Video;
import com.zhiyou100.zyVideo.service.FrontCourseSerivce;

@Controller
public class FrontCourseController {

	@Autowired
	FrontCourseSerivce fcs;

	@RequestMapping("front/course/coruseIndex")
	public String courseIndex(String subjectId, Model m) {
		m.addAttribute("subject", fcs.getsubject(subjectId));
		List<Course> list = fcs.getFrontCourse(subjectId);
		for (Course course : list) {
			for (Video video : course.getVideoList()) {
				video.setVideoLengthStr(video.getVideoLength() / 60 + "分" + video.getVideoLength() % 60 + "秒");
			}
		}
		m.addAttribute("courses", list);
		m.addAttribute("subjectId", subjectId);
		return "forward:/WEB-INF/front/course/index.jsp";
	}

	@RequestMapping("/front/video/index")
	public String videoxIndex(String videoId, String subjectId, Model m) {
		List<Video> videoList = fcs.getFrontVideoList(subjectId);
		for (Video video : videoList) {
			video.setVideoLengthStr(video.getVideoLength() / 60 + "分" + video.getVideoLength() % 60 + "秒");
		}
		m.addAttribute("videoList", videoList);
		m.addAttribute("FrontData", fcs.getFrontData(videoId));
		return "forward:/WEB-INF/front/video/index.jsp";
	}

	@RequestMapping("/front/video/state.action")
	public void addVideoPlayTimes(String videoId) {
		fcs.addVideoPlayTimes(Integer.parseInt(videoId));
	}
}
