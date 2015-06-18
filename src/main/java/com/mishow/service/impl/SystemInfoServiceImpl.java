package com.mishow.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mishow.constants.Constants;
import com.mishow.dao.SystemInfoDao;
import com.mishow.po.SystemInfo;
import com.mishow.service.SystemInfoService;

@Service("systemInfoService")
public class SystemInfoServiceImpl implements SystemInfoService {
	@Resource(name = "systemInfoDao")
	SystemInfoDao systemInfoDao;

	@Override
	public int getTotalNum() {
		// 还得这么转化
		String longst = "" + systemInfoDao.getTotalNum();
		return Integer.valueOf(longst);
	}

	@Override
	public List<SystemInfo> getCurrentPageList(int pageOffSet) {
		return systemInfoDao.getCurrentPageListDesc(pageOffSet, Constants.SYSTEMINFO_PAGE_SIZE);
	}

	@Override
	public int addSystemInfo(SystemInfo info) {
		systemInfoDao.save(info);
		return 1;
	}

	@Override
	public void delete(int id) {
		systemInfoDao.delete(id);
	}

	@Override
	public List<SystemInfo> getTopNSystemInfoList(int systeminfoTopn) {
		return systemInfoDao.getCurrentPageListDesc(0, systeminfoTopn);
	}

	@Override
	public void update(SystemInfo systemInfo) {
		systemInfoDao.update(systemInfo);
	}

	@Override
	public SystemInfo getSystemInfoById(int id) {
		return systemInfoDao.get(id);
	}

}
