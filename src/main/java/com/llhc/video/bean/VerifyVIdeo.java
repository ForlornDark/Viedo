package com.llhc.video.bean;

import java.util.Date;

public class VerifyVIdeo extends Video{
	//审核ID
	private int vvId;
	//是否通过
	private boolean access;
	//审核发送时间
	private Date sendTime;
	//发送的用户ID
	private int uId;
	public int getVvId() {
		return vvId;
	}
	public void setVvId(int vvId) {
		this.vvId = vvId;
	}
	public boolean isAccess() {
		return access;
	}
	public void setAccess(boolean access) {
		this.access = access;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	
}
