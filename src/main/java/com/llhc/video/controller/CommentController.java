package com.llhc.video.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.llhc.video.bean.Comment;
import com.llhc.video.bean.User;
import com.llhc.video.bean.Video;
import com.llhc.video.service.impl.CommentSeriuceImpl;
import com.llhc.video.service.impl.VideoServiceImpl;

@Controller
public class CommentController {

	@Autowired
	private CommentSeriuceImpl commentSeriuceImpl;
	@Autowired
	private VideoServiceImpl videoServiceImpl;
	
	
	@RequestMapping("addComment")	
	public void addComment(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	
		String context=request.getParameter("context");
		int agree=Integer.parseInt(request.getParameter("rating"));
		int vid=Integer.parseInt(request.getParameter("vid"));
	
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		System.out.println(context+vid+agree+user.getUid());
		Comment comment = new Comment();
		
		comment.setVid(vid);
		comment.setContent(context);
		comment.setUid(user.getUid());
		comment.setDate(new Date());
		if (agree>=6) {
			comment.setAgree(1);
		}else {
			comment.setAgree(0);
		}
		int res= commentSeriuceImpl.addComment(comment);
		if (res==1) {
			Video video=videoServiceImpl.findVideoById(vid);
			List<Comment> comments=commentSeriuceImpl.findManagersByVid(vid);
			request.setAttribute("video", video);
			request.setAttribute("comments", comments);
			request.getRequestDispatcher("detail.jsp").forward(request, response);
		}

	}
}
