package com.llhc.video.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llhc.video.bean.Person;
import com.llhc.video.bean.User;
import com.llhc.video.dao.UserDao;
import com.llhc.video.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public void getUser() {
		
		List<User> users = userDao.getUsers();
		for (User u : users) {
			System.out.println(u.getName());
		}
	}
	
	public void getUserById() {
		
		User user = userDao.getUserById(2);
		System.out.println(user.getName());
		
	}

	public void getUserByName() {
		
		User user = userDao.getUserByName("vss");
		System.out.println(user.getName());
	}

	public void addUser() {
		
		User user = new User();
		user.setName("bill");
		user.setMail("116993@qq.com");
		user.setPassword("12345647897");
		userDao.addUser(user);
		
	}

	public void updateUser() {
		
		User user = new User();
		user.setUid(2);
		user.setName("bill");
		user.setMail("116993@qq.com");
		user.setPassword("12345647897");
		userDao.updateUser(user);
		
	}

	public void deleteUserById() {
		
		userDao.deleteUserById(3);
		
	}




}
