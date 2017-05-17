package com.llhc.video.bean;

import java.util.Date;

public class Comment {
	private int cid;
	//评论内容
	private String content;
	//评论用户ID
	private int uid;
	//评论电影ID
	private int vid;
	//同意次数
	private int agree;
	//反对次数
	private int oppose;
	//评论日期
	private Date date;
	
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getAgree() {
		return agree;
	}
	public void setAgree(int agree) {
		this.agree = agree;
	}
	public int getOppose() {
		return oppose;
	}
	public void setOppose(int oppose) {
		this.oppose = oppose;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
