package com.mishow.constants;

public class Constants {
	// 时间格式字符串
	public static final String SECOND_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String MINUTE_TIME_FORMAT = "yyyy-MM-dd HH:mm";
	public static final String DAY_TIME_FORMAT = "yyyy-MM-dd";
	
	// system info base url
	public static final String SYSTEMINFO_BASE_URL = "/teststyle/systeminfo/getCurrentPageSystemInfoListByManager.action";
	//question base url
	public static final String QUSETION_BASE_URL = "/teststyle/question/getCurrentPageQuestionListOfSearch.action";
	//question base url
	public static final String QUSETION_BY_USER_BASE_URL = "/teststyle/question/getCurrentPageQuestionListByUsername.action";
	//user info base url
	public static final String USERINFO_BASE_URL = "/teststyle/userinfo/getCurrentPageUserInfoList.action";

	
	//系统消息的分页大小
	public static final int SYSTEMINFO_PAGE_SIZE = 6;
	public static final int QUESTION_PAGE_SIZE = 6;
	public static final int USERINFO_PAGE_SIZE = 10;
	public static final int USER_PAGE_SIZE = 5;
	public static final String USER_BASE_URL ="/teststyle/user/getCurrentPageUserList.action";
	public static final String USER_BY_SUBJECT_URL = "/teststyle/user/getCurrentPageUserListBySubject.action";
	public static final String QUSETION_BY_TEACHER_BASE_URL = "/teststyle/question/getCurrentPageQuestionListByUsername.action";;
	public static final String QUSETION_BY_SUBJECT_BASE_URL = "/teststyle/question/getCurrentPageQuestionListBySubject.action";;
	public static final String QUSETION_BY_TYPE_BASE_URL = "/teststyle/question/getCurrentPageQuestionListByType.action";
	public static final String QUSETION_BY_MAJOTANDSUBJECT_BASE_URL = "/teststyle/question/getCurrentPageQuestionListByMajorAndSubject.action";
	//系统消息topn的大小
	public static final int SYSTEMINFO_TOPN = 6;

}
