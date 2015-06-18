package com.mishow.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.mishow.constants.Constants;
import com.mishow.po.SystemInfo;
import com.mishow.service.SystemInfoService;
import com.mishow.vo.Pagination;

@Controller("systemInfoAction")
public class SystemInfoAction extends MarsAction {

	SystemInfo systemInfo;

	List<SystemInfo> systeminfoList;

	@Resource(name = "systemInfoService")
	SystemInfoService systemInfoService;

	public SystemInfo getSystemInfo() {
		return systemInfo;
	}

	public void setSystemInfo(SystemInfo systemInfo) {
		this.systemInfo = systemInfo;
	}

	public List<SystemInfo> getSysteminfoList() {
		return systeminfoList;
	}

	public void setSysteminfoList(List<SystemInfo> systeminfoList) {
		this.systeminfoList = systeminfoList;
	}

	public String getCurrentPageSystemInfoList() {
		/*
		 * 构造分页对象
		 */
		pager = new Pagination(Constants.SYSTEMINFO_PAGE_SIZE, systemInfoService.getTotalNum(), pagerOffset);
		List<SystemInfo> userList = systemInfoService.getCurrentPageList(pager.getOffset());
		pager.setList(userList);
		pager.setUrl(Constants.SYSTEMINFO_BASE_URL);

		return SUCCESS;
	}

	public String addSystemInfo() {
		systemInfoService.addSystemInfo(systemInfo);
		return SUCCESS;
	}

	public String delete() {
		systemInfoService.delete(id);
		return SUCCESS;
	}

	public String getTopNSystemInfoList() {
		systeminfoList = systemInfoService.getTopNSystemInfoList(Constants.SYSTEMINFO_TOPN);
		return "success";
	}
	
	public String update() {
		systemInfoService.update(systemInfo);
		return "success";
	}
	
	public String gotoUpdatePage(){
		systemInfo=systemInfoService.getSystemInfoById(id);
		return SUCCESS;
	}

}
