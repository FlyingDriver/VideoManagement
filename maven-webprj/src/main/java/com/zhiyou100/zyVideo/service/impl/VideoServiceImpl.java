package com.zhiyou100.zyVideo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhiyou100.zyVideo.mapper.VideoMapper;
import com.zhiyou100.zyVideo.model.SQLVO;
import com.zhiyou100.zyVideo.model.Video;
import com.zhiyou100.zyVideo.service.VideoService;
import com.zhiyou100.zyVideo.util.Page;

@Service
public class VideoServiceImpl implements VideoService {
	
	@Autowired
	VideoMapper vm;
	
	@Override
	public Page<Video> getAllVideo(String title,String speaker,String course,Integer page) {
		SQLVO vo=new SQLVO();
		Page<Video> pager=new Page<>();
		Integer curentnum=5*(page-1);
		vo.setTitle(title);
		vo.setSpeaker(speaker);
		vo.setCourse(course);
		vo.setPage(curentnum);
		pager.setRows(vm.getAllVideo(vo));
		pager.setPage(page);
		pager.setSize(5);
		return pager;
	}
	@Override
	public Integer getVideoCount(String title, String speaker, String course) {
		SQLVO vo=new SQLVO();
		vo.setTitle(title);
		vo.setSpeaker(speaker);
		vo.setCourse(course);
		return vm.getVideoCount(vo);
	}
	@Override
	public boolean addVideo(Video v) {
		if(vm.insertSelective(v)>0){
			return true;
		}
		return false;
	}
	@Override
	public Video getVideoById(int id) {
		return vm.selectByPrimaryKey(id);
	}
	@Override
	public boolean updateVideo(Video v) {
		if(vm.updateByPrimaryKeySelective(v)>0){
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteVideo(Integer id) {
		if(vm.deleteByPrimaryKey(id)>0){
		}
		return false;
	}
	@Override
	public boolean batchesDelete(String str) {
		vm.batchesDelete(str);
		return false;
	}

}
