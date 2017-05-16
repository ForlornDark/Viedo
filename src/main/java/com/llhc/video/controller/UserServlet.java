package com.llhc.video.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.llhc.video.dao.impl.UserService;

@Controller
@WebServlet("/user.do")
public class UserServlet  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserService uService;
	
	@Override
	public void init() throws ServletException {
		/**
		 * 1. 获取WebApplicationContext
		 * 2. 获取AutowireCapableBeanFactory 
		 */
		WebApplicationContext wc = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		AutowireCapableBeanFactory autowireCapableBeanFactory = wc.getAutowireCapableBeanFactory();
		autowireCapableBeanFactory.autowireBean(this);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		uService.getUsers();
	}
}
