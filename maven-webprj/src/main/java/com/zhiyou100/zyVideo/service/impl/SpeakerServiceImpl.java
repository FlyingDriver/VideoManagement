package com.zhiyou100.zyVideo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.zyVideo.mapper.SpeakerMapper;
import com.zhiyou100.zyVideo.model.Speaker;
import com.zhiyou100.zyVideo.service.SpeakerService;
import com.zhiyou100.zyVideo.util.Page;

@Service
public class SpeakerServiceImpl implements SpeakerService {

	@Autowired
	SpeakerMapper sm;
	
	@Override
	public List<Speaker> getAllspeaker() {
		return sm.selectByExample(null);
	}

	@Override
	public Page<Speaker> getSpeakers(String job, String name, Integer page) {
		Integer currentnum =5*(page-1);
		List<Speaker> speakers = sm.getSpeakers(job,name,currentnum);
		Page<Speaker> page1=new Page<>();
		page1.setRows(speakers);
		return page1;
	}

	@Override
	public int getSpeakerCount(String job, String name) {
		return sm.getSpeakerCount(job, name);
	}

	@Override
	public boolean addSpeaker(Speaker s) {
		 if(sm.insertSelective(s)>0){
			 return true;
		 }
		return false;
	}

	@Override
	public Speaker getSpeakerById(Integer id) {
		return sm.selectByPrimaryKey(id);
	}

	@Override
	public boolean updateSpeaker(Speaker s) {
		if(sm.updateByPrimaryKeySelective(s)>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteSpeaker(Integer id) {
		if(sm.deleteByPrimaryKey(id)>0){
			return true;
		}
		return false;
	}

}
