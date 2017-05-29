package com.llhc.video.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.llhc.video.bean.Comment;
import com.llhc.video.bean.Video;
import com.llhc.video.service.impl.CommentSeriuceImpl;
import com.llhc.video.service.impl.VideoServiceImpl;

@Controller
public class VideoController {
	
	@Autowired
	private CommentSeriuceImpl commentSeriuceImpl;
	@Autowired
	private VideoServiceImpl videoServiceImpl;
	
	@RequestMapping("search")
	@ResponseBody
	public List<Video> search(String key) {
		
		List<Video> videos = videoServiceImpl.getVideosByKey(key);
		return videos;
		
	}
	@RequestMapping("selectList")
	@ResponseBody
	public List<Video> selectList() {
		
		List<Video> videos = videoServiceImpl.getVideos();
		return videos;
		
	}
	
	@RequestMapping("selectList1")
	@ResponseBody
	public List<Video> selectList1() {
		
		List<Video> videos2 =videoServiceImpl.getVideos2();
		return videos2;
	}
	
	@RequestMapping("findVideoByType")
	public void findVideoByType(Integer type,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		List<Video> videos =videoServiceImpl.getVideoByType(type);
		request.setAttribute("videos", videos);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	@RequestMapping("findVideoByArea")
	public void findVideoByArea(Integer area,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		List<Video> videos =videoServiceImpl.getVideoByArea(area);
		request.setAttribute("videos", videos);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	@RequestMapping("findVideosByDowncount")
	public void findVideosByDowncount(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		List<Video> videos =videoServiceImpl.findVideosByDowncount();
		request.setAttribute("videos", videos);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	@RequestMapping("findVideosByScore")
	public void findVideosByScore(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		List<Video> videos =videoServiceImpl.findVideosByScore();
		request.setAttribute("videos", videos);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	@RequestMapping("detail")
	public void detail(Integer vid,HttpServletRequest request,HttpServletResponse response) {
		
		Video video=videoServiceImpl.findVideoById(vid);
		List<Comment> comments=commentSeriuceImpl.findManagersByVid(vid);
		
		for(Comment c:comments){
			System.out.println(c.getContent());
		}
	}
}
