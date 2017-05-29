package com.llhc.video.dao;

import java.util.List;
import java.util.Map;

import com.llhc.video.bean.Video;

public interface VideoDao {

	public List<Video> getVideos();
	
	public Video getVideoById(Integer vid);
	
	public List<Video> getVideoByType(Integer type);
	
	public Integer addVideo(Video video);
	
	public Integer updateVideo(Video video);
	
	public Integer deleteVideoById(Integer vid);

	public List<Video> getVideoBykey(String key);

	public List<Video> getVideosByDate();

	public List<Video> getVideoByArea(Integer area);

	public List<Video> findVideosByScore();

	public List<Video> findVideosByDowncount();

}
