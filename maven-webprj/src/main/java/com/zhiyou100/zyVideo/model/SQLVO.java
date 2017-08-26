package com.zhiyou100.zyVideo.model;


public class SQLVO {
	
	private String title;
	private String speaker;
	private String course;
	private Integer page;
	
	
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "SQLVO [title=" + title + ", speaker=" + speaker + ", course=" + course + ", page=" + page + "]";
	}
	
	
	
}
