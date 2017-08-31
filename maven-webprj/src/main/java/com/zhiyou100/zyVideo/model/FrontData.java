package com.zhiyou100.zyVideo.model;

public class FrontData {

	private String videoUrl;
	private String videoImageUrl;
	private String videoTitle;
	private String videoDescr;
	private String speakerHeadUrl;
	private String speakerDescr;
	private String speakerName;
	private String courseDescr;
	private Integer id;
	private Integer subId;
	private String  subName;

	
	
	
	
	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public Integer getSubId() {
		return subId;
	}

	public void setSubId(Integer subId) {
		this.subId = subId;
	}
	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getVideoImageUrl() {
		return videoImageUrl;
	}

	public void setVideoImageUrl(String videoImageUrl) {
		this.videoImageUrl = videoImageUrl;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	public String getVideoDescr() {
		return videoDescr;
	}

	public void setVideoDescr(String videoDescr) {
		this.videoDescr = videoDescr;
	}


	public String getSpeakerHeadUrl() {
		return speakerHeadUrl;
	}

	public void setSpeakerHeadUrl(String speakerHeadUrl) {
		this.speakerHeadUrl = speakerHeadUrl;
	}

	public String getSpeakerDescr() {
		return speakerDescr;
	}

	public void setSpeakerDescr(String speakerDescr) {
		this.speakerDescr = speakerDescr;
	}

	public String getSpeakerName() {
		return speakerName;
	}

	public void setSpeakerName(String speakerName) {
		this.speakerName = speakerName;
	}

	public String getCourseDescr() {
		return courseDescr;
	}

	public void setCourseDescr(String courseDescr) {
		this.courseDescr = courseDescr;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "FrontData [videoUrl=" + videoUrl + ", videoImageUrl=" + videoImageUrl + ", videoTitle=" + videoTitle
				+ ", videoDescr=" + videoDescr + ", speakerHeadUrl=" + speakerHeadUrl + ", speakerDescr=" + speakerDescr
				+ ", speakerName=" + speakerName + ", courseDescr=" + courseDescr + ", id=" + id + ", subId=" + subId
				+ ", subName=" + subName + "]";
	}

	
	


}
