package com.llhc.video.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.llhc.video.bean.User;
import com.llhc.video.service.impl.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	@ResponseBody
	@RequestMapping("/findUsers")
	public String findUsers(){
		List<User> users = userServiceImpl.getUser();
		String body = "";
		
		for (User user :users){
			body = body+user.getName();
		}
		return body;
	}
	@RequestMapping("/m02")
	@ResponseBody
	public String m02(@RequestParam(required=true,value="sid",defaultValue="100") String id) {
	        System.out.println("id = " + id);
	        return "m02";
	}
}
