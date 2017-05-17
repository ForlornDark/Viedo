package com.llhc.video.bean;

import java.util.Date;

public class Video {
	//电影ID
	private int vid;
	//电影名
	private String name;
	//电影产地
	private int area;
	//电影类型
	private int type;
	//语言
	private int language;
	//电影介绍
	private String introduce;
	//电影评分
	private float score;
	//审核通过管理员ID
	private int mid;
	//电影地址
	private String location;
	//上映日期
	private Date release;
	//更新日期
	private Date update;
	//下载次数
	private int downCount;

	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getLanguage() {
		return language;
	}
	public void setLanguage(int language) {
		this.language = language;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getRelease() {
		return release;
	}
	public void setRelease(Date release) {
		this.release = release;
	}
	public Date getUpdate() {
		return update;
	}
	public void setUpdate(Date update) {
		this.update = update;
	}
	public int getDownCount() {
		return downCount;
	}
	public void setDownCount(int downCount) {
		this.downCount = downCount;
	}
	
}
