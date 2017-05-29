package com.llhc.video.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llhc.video.bean.Video;
import com.llhc.video.dao.VideoDao;
import com.llhc.video.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoDao videoDao;
	

	public List<Video> getVideosByKey(String key) {
		
		return videoDao.getVideoBykey(key);
	}


	public List<Video> getVideos() {
		
		return videoDao.getVideos();
	}


	public List<Video> getVideos2() {

//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("start", 1);
//		map.put("sice", 5);
		return videoDao.getVideosByDate();
	}


	public List<Video> getVideoByType(Integer type) {

		return videoDao.getVideoByType(type);
	}


	public List<Video> getVideoByArea(Integer area) {
	
		return videoDao.getVideoByArea(area);
	}


	public List<Video> findVideosByScore() {

		return videoDao.findVideosByScore();
	}


	public List<Video> findVideosByDowncount() {

		return videoDao.findVideosByDowncount();
	}


	public Video findVideoById(Integer vid) {

		return videoDao.getVideoById(vid);
	}



}
