package com.llhc.video.bean;

import java.io.Serializable;

public abstract class Person implements Serializable{
	//用户ID
	private int uId;
	//用户名
	private String name;
	//用户密码
	private String password;
	//用户邮箱
	private String mail;
	//用户角色
	public abstract byte getRole();
	
	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
