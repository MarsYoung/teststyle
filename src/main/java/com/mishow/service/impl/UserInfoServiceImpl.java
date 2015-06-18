package com.mishow.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mishow.constants.Constants;
import com.mishow.dao.UserInfoDao;
import com.mishow.po.UserInfo;
import com.mishow.service.UserInfoService;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Resource(name = "userInfoDao")
	UserInfoDao userInfoDao;

	@Override
	public int getTotalNum() {
		//还得这么转化
		String longst=""+userInfoDao.getTotalNum();
		return Integer.valueOf(longst);
	}

	@Override
	public List<UserInfo> getCurrentPageList(int pageOffSet) {
		return userInfoDao.getCurrentPageListDesc(pageOffSet, Constants.USERINFO_PAGE_SIZE);
	}

}
