package com.zhiyou100.zyVideo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.zyVideo.mapper.SubjectMapper;
import com.zhiyou100.zyVideo.model.Subject;
import com.zhiyou100.zyVideo.service.SubjectService;


@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	SubjectMapper sm;
	
	@Override
	public List<Subject> getAllSubject() {
		return sm.selectByExample(null);
	}

	
}
