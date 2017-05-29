package com.llhc.video.service;

import java.util.List;

import com.llhc.video.bean.Video;

public interface VideoService {
	
	public List<Video> getVideosByKey(String key);
	
	public List<Video> getVideos();
	
	public List<Video> getVideos2();
	
	public List<Video> getVideoByType(Integer type);
	
	public List<Video> getVideoByArea(Integer area);
	
	public List<Video> findVideosByDowncount();
	
	public List<Video> findVideosByScore();
	
	public Video findVideoById(Integer vid);
}
