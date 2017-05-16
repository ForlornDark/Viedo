package com.llhc.video.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llhc.video.bean.User;
import com.llhc.video.dao.UserDao;

@Service
public class UserServiceImpl implements UserDao {

	@Autowired
	private UserDao userDao;
	
	
	public List<User> getUsers() {
		
		return userDao.getUsers();
	}

}
