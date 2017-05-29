package com.llhc.video.service.impl;

import java.util.List;

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



}
