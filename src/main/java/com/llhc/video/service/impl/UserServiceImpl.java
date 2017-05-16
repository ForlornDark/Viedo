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

	public User getUserById() {
		// TODO Auto-generated method stub
		return null;
	}

}
