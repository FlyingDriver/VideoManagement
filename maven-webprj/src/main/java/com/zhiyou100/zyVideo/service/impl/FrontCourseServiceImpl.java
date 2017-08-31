package com.zhiyou100.zyVideo.service.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhiyou100.zyVideo.mapper.CourseMapper;
import com.zhiyou100.zyVideo.mapper.SpeakerMapper;
import com.zhiyou100.zyVideo.mapper.SubjectMapper;
import com.zhiyou100.zyVideo.mapper.VideoMapper;
import com.zhiyou100.zyVideo.model.Course;
import com.zhiyou100.zyVideo.model.FrontData;
import com.zhiyou100.zyVideo.model.Speaker;
import com.zhiyou100.zyVideo.model.Subject;
import com.zhiyou100.zyVideo.model.UserExample;
import com.zhiyou100.zyVideo.model.Video;
import com.zhiyou100.zyVideo.model.VideoExample;
import com.zhiyou100.zyVideo.model.VideoExample.Criteria;
import com.zhiyou100.zyVideo.service.FrontCourseSerivce;

@Service
public class FrontCourseServiceImpl implements FrontCourseSerivce {

	@Autowired 
	CourseMapper cm;
	@Autowired
	SubjectMapper sm;
	@Autowired
	VideoMapper vm;
	@Autowired
	SpeakerMapper spm;

	@Override
	public List<Course> getFrontCourse(String subjectId) {
		return cm.getFrontCourse(Integer.parseInt(subjectId));
	}

	@Override
	public Subject getsubject(String subjectId) {
		return sm.selectByPrimaryKey(Integer.parseInt(subjectId));
	}

	@Override
	public Video getVideos(String videoId) {
		return vm.selectByPrimaryKey(Integer.parseInt(videoId));
	}

	@Override
	public FrontData getFrontData(String videoId) {
		
		return vm.getFrontData(Integer.parseInt(videoId));
	}

	@Override
	public List<Video> getFrontVideoList(String subjectId) {
		return vm.getFrontVideoList(Integer.parseInt(subjectId));
	}

	@Override
	public void addVideoPlayTimes(Integer videoid) {
		vm.addVideoPlayTimes(videoid);
		
	}
	
}
