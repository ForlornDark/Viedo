package com.llhc.video.bean;

import java.util.Date;

public class VerifyVIdeo extends Video{
	//閫佸ID
	private int vvId;
	//鏄惁瀹℃牳閫氳繃
	private boolean access;
	//鍙戦�佸鏍告椂闂�
	private Date sendTime;
	//鐢ㄦ埛ID
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
