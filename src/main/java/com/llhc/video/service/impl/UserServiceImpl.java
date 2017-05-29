package com.llhc.video.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llhc.video.bean.User;
import com.llhc.video.dao.UserDao;
import com.llhc.video.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public List<User> getUser() {
		
		List<User> users = userDao.getUsers();
		
		return users;
	}
	
	public void getUserById() {
		
		User user = userDao.getUserById(2);
		System.out.println(user.getName());
		
	}

	public User getUserByName(String name) {
		
		return userDao.getUserByName(name);
	}

	public int addUser(User user) {
		
		return userDao.addUser(user);
		
	}

	public void updateUser() {
		
		User user = new User();
		user.setUid(2);
		user.setName("bbs");
		user.setMail("116993@qq.com");
		user.setPassword("12345647897");
		System.out.println(userDao.updateUser(user));
		
	}

	public void deleteUserById() {
		
		System.out.println(userDao.deleteUserById(5));
		
	}

	public User getUserByNameEmail(String name,String email) {
	
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		map.put("email", email);
		return userDao.getUserByNameEmail(map);
	}




}
