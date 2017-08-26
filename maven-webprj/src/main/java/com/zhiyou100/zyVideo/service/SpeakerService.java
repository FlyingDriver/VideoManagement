package com.zhiyou100.zyVideo.service;

import java.util.List;

import com.zhiyou100.zyVideo.model.Speaker;
import com.zhiyou100.zyVideo.util.Page;

public interface SpeakerService {

	List<Speaker> getAllspeaker();

	Page<Speaker> getSpeakers(String job, String name, Integer page);

	int getSpeakerCount(String job, String name);
	boolean addSpeaker(Speaker s);

	Speaker getSpeakerById(Integer id);

	boolean updateSpeaker(Speaker s);

	boolean deleteSpeaker(Integer id);
}
