package com.llhc.video.bean;

import java.util.Date;

public class VerifyVideo extends Video{
	//审核ID
	private int vvid;
	//是否通过
	private boolean access;
	//审核发送时间
	private Date sendtime;
	//发送的用户ID
	private int uid;
	

	public boolean isAccess() {
		return access;
	}
	public void setAccess(boolean access) {
		this.access = access;
	}
	public int getVvid() {
		return vvid;
	}
	public void setVvid(int vvid) {
		this.vvid = vvid;
	}
	public Date getSendtime() {
		return sendtime;
	}
	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}

	
}
