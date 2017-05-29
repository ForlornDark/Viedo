package com.llhc.video.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.llhc.video.bean.Video;
import com.llhc.video.service.impl.VideoServiceImpl;

@Controller
public class VideoController {
	
	@Autowired
	private VideoServiceImpl videoServiceImpl;
	
	@RequestMapping("search")
	@ResponseBody
	public List<Video> search(String key, ModelMap map,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Video> videos = videoServiceImpl.getVideosByKey(key);

		return videos;
		
	}
	@RequestMapping(value = "selectList.do",method={RequestMethod.POST})
	@ResponseBody
	public List<Video> selectList() {
		List<Video> videos = videoServiceImpl.getVideos();


		
		return videos;
		
	}
}
