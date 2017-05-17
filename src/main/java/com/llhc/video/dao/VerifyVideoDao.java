package com.llhc.video.dao;

import java.util.List;

import com.llhc.video.bean.VerifyVIdeo;

public interface VerifyVideoDao {
	
	public List<VerifyVIdeo> getVerifyVideos();
	
	public VerifyVIdeo getVerifyVideoById(Integer vvid);
	
	public VerifyVIdeo getVerifyVideoByName(String name);
	
	public Integer addVerifyVideo(VerifyVIdeo verifyVIdeo);
	
	public Integer updateVerifyVideo(VerifyVIdeo verifyVIdeo);
	
	public Integer deleteVerifyVideoById(Integer vvid); 
}
