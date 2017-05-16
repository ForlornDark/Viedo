package com.llhc.video.bean;

import java.io.Serializable;

public abstract class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	//用户ID
	private int uid;
	//用户名
	private String name;
	//用户密码
	private String password;
	//用户邮箱
	private String mail;


	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
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
