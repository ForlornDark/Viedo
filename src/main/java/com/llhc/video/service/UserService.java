package com.llhc.video.service;

import java.util.List;
import com.llhc.video.bean.User;

public interface UserService {

	public List<User> getUser();
	
	public void getUserById();
	
	public User getUserByName(String name);
	
	public User getUserByNameEmail(String name,String email);
	
	public int addUser(User user);
	
	public void updateUser();
	
	public void deleteUserById();
}
