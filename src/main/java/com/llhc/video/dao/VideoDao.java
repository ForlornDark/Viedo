package com.llhc.video.dao;

import java.util.List;

import com.llhc.video.bean.Video;

public interface VideoDao {

	public List<Video> getVideos();
	
	public Video getVideoById(Integer vid);
	
	public Video getVideoByName(String name);
	
	public Integer addVideo(Video video);
	
	public Integer updateVideo(Video video);
	
	public Integer deleteVideoById(Integer vid);

	public List<Video> getVideoBykey(String key);
}
