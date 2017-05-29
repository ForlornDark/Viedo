package com.llhc.video.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.llhc.video.bean.User;
import com.llhc.video.service.impl.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping("sinup")
	@ResponseBody
	public String sinup(String name, String password, String email, HttpServletRequest request) {
		User user = userServiceImpl.getUserByNameEmail(name, email);
		if (user != null) {
			return "0";
		} else {
			User user2 = new User();
			user2.setMail(email);
			user2.setName(name);
			user2.setPassword(password);
			int i = userServiceImpl.addUser(user2);
			if (i != 0) {
				HttpSession session = request.getSession();
				session.setAttribute("user", user2);
				return "1";
			}
			return "0";
		}

	}

	@RequestMapping("findUserByName")
	@ResponseBody
	public String findUserByName(String name, String password, HttpServletRequest request) {
		User user = userServiceImpl.getUserByName(name);
		if (user != null) {
			if (user.getPassword().equals(password)) {
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				return "1";
			} else {
				return "0";
			}
		}
		return "0";
	}

	@RequestMapping("logout")
	@ResponseBody
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "1";
	}
}
