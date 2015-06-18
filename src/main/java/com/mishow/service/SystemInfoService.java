package com.mishow.service;

import java.util.List;

import com.mishow.po.SystemInfo;


/**
 * 分装用户独特于模型marsservice的一般业务
 * 
 * @author marsyoung
 * 
 */
public interface SystemInfoService {
	int getTotalNum();
	List<SystemInfo> getCurrentPageList(int pageOffSet);
	int addSystemInfo(SystemInfo info);
	void delete(int id);
	List<SystemInfo> getTopNSystemInfoList(int systeminfoTopn);
	void update(SystemInfo systemInfo);
	SystemInfo getSystemInfoById(int id);
	
}
