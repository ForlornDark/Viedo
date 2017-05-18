package com.llhc.video.dao;

import java.util.List;

import com.llhc.video.bean.VerifyVideo;

public interface VerifyVideoDao {
	
	public List<VerifyVideo> getVerifyVideos();
	
	public VerifyVideo getVerifyVideoById(Integer vvid);
	
	public VerifyVideo getVerifyVideoByName(String name);
	
	public Integer addVerifyVideo(VerifyVideo verifyVideo);
	
	public Integer updateVerifyVideo(VerifyVideo verifyVideo);
	
	public Integer deleteVerifyVideoById(Integer vvid); 
}
