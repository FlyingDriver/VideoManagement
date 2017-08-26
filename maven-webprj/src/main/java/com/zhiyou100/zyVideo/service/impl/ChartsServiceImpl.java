package com.zhiyou100.zyVideo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.zyVideo.mapper.ChartsMapper;
import com.zhiyou100.zyVideo.model.ChartsData;
import com.zhiyou100.zyVideo.service.ChartsService;


@Service
public class ChartsServiceImpl implements ChartsService {

	@Autowired
	ChartsMapper cm;

	@Override
	public List<ChartsData> getData() {
		return  cm.getAllDataInfo();
	}


}
