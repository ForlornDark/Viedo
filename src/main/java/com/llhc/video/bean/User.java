package com.llhc.video.bean;

public class User extends Person{

	private static final long serialVersionUID = 1L;
	private final byte role = 0;

	@Override
	public byte getRole() {
		// TODO Auto-generated method stub
		return role;
	}
	
}
