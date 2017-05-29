package com.llhc.video.dao;


import java.util.List;
import java.util.Map;

import com.llhc.video.bean.User;;

public interface UserDao {

	public List<User> getUsers();
	
	public User getUserById(Integer uid);
	
	public User getUserByName(String name);
	
	public Integer addUser(User user);
	
	public Integer updateUser(User user);
	
	public Integer deleteUserById(Integer uid);

	public User getUserByNameEmail(Map<String, Object> map);
}
