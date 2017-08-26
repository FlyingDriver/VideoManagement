package com.zhiyou100.zyVideo.model;

public class ChartsData {

	private String dataName;
	private Integer dataNum;
	public String getDataName() {
		return dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}
	public Integer getDataNum() {
		return dataNum;
	}
	public void setDataNum(Integer dataNum) {
		this.dataNum = dataNum;
	}
	@Override
	public String toString() {
		return "{\"dataName\":\""+ dataName + "\""+",\"dataNum\":"+dataNum+"}";
	}
	
	
}
