package com.llhc.video.dao;

import java.util.List;

import com.llhc.video.bean.Manager;

public interface ManagerDao {
	public List<Manager> getManagers();
	
	public Manager getManagerById(Integer mid);
	
	public Manager getManagerByName(String name);
	
	public Integer addManager(Manager manager);
	
	public Integer updateManager(Manager manager);
	
	public Integer deleteManagerById(Integer mid);
}
