package com.llhc.video.bean;

import com.mysql.fabric.xmlrpc.base.Data;

public class VerifyVIdeo extends Video{
	//送审ID
	private int vvId;
	//是否审核通过
	private boolean access;
	//发送审核时间
	private Data sendTime;
	//用户ID
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
	public Data getSendTime() {
		return sendTime;
	}
	public void setSendTime(Data sendTime) {
		this.sendTime = sendTime;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	
}
