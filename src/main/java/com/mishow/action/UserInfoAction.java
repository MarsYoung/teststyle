package com.mishow.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.mishow.constants.Constants;
import com.mishow.po.UserInfo;
import com.mishow.service.UserInfoService;
import com.mishow.vo.Pagination;

@Controller("userInfoAction")
public class UserInfoAction extends MarsAction {

	@Resource(name = "userInfoService")
	UserInfoService userInfoService;

	public String getCurrentPageUserInfoList() {
		/*
		 * 构造分页对象
		 */
		pager = new Pagination(Constants.USERINFO_PAGE_SIZE, userInfoService.getTotalNum(), pagerOffset);
		List<UserInfo> userInfoList = userInfoService.getCurrentPageList(pager.getOffset());
		pager.setList(userInfoList);
		pager.setUrl(Constants.USERINFO_BASE_URL);
		return SUCCESS;
	}

}
