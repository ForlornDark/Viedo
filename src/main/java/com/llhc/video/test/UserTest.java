package com.llhc.video.test;



import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.llhc.video.bean.User;
import com.llhc.video.dao.impl.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:com/llhc/video/config/spring-*.xml")

public class UserTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void getUsers() {
		
		List<User>users=userService.getUsers();
		for (User u:users) {
			System.out.println(u.getName());
		}
	}

}
