package com.llhc.video.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.llhc.video.bean.User;
import com.llhc.video.service.impl.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("/findUsers")
	public void findUsers(){
		List<User> list = userServiceImpl.getUser();
		for(User u: list){
			System.out.println(u.getName());
		}
//		return userServiceImpl.getUser();
	}
	@RequestMapping("/m02")
	public String m02(@RequestParam(required=true,value="sid",defaultValue="100") String id) {
	        System.out.println("id = " + id);
	        return "m02";
	}
}
