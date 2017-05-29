package com.llhc.video.service;

import java.util.List;

import com.llhc.video.bean.Video;

public interface VideoService {
	
	public List<Video> getVideosByKey(String key);
	
	public List<Video> getVideos();
}
