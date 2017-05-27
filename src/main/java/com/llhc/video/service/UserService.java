package com.llhc.video.service;

import java.util.List;

import com.llhc.video.bean.User;

public interface UserService {

	public List<User> getUser();
	
	public void getUserById();
	
	public void getUserByName();
	
	public void addUser();
	
	public void updateUser();
	
	public void deleteUserById();
}
