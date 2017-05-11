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
}
