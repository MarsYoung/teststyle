package com.mishow.service;

import java.util.List;

import com.mishow.po.UserInfo;


/**
 * 分装用户独特于模型marsservice的一般业务
 * 
 * @author marsyoung
 * 
 */
public interface UserInfoService {
	int getTotalNum();
	List<UserInfo> getCurrentPageList(int pageOffSet);
	
}
