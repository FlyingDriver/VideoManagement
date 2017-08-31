package com.zhiyou100.zyVideo.service;


import java.util.List;

import com.zhiyou100.zyVideo.model.Course;
import com.zhiyou100.zyVideo.model.FrontData;
import com.zhiyou100.zyVideo.model.Subject;
import com.zhiyou100.zyVideo.model.Video;

public interface FrontCourseSerivce {

	List<Course> getFrontCourse(String subjectId);

	Subject getsubject(String subjectId);

	Video getVideos(String videoId);

	FrontData getFrontData(String videoId);

	List<Video> getFrontVideoList(String subjectId);

	void addVideoPlayTimes(Integer parseInt);

}
