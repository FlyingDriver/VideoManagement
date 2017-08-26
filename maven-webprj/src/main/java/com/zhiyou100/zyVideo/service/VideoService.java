package com.zhiyou100.zyVideo.service;



import com.zhiyou100.zyVideo.model.Video;
import com.zhiyou100.zyVideo.util.Page;

public interface VideoService {

	
	Page<Video> getAllVideo(String title,String speaker,String course, Integer page);
	Integer getVideoCount(String title,String speaker,String course);
	boolean addVideo(Video v);
	Video getVideoById(int id);
	boolean updateVideo(Video v);
	boolean deleteVideo(Integer id);
	boolean batchesDelete(String str);
}
