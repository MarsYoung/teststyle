package com.mishow.action;

import com.opensymphony.xwork2.ActionSupport;

/*
 * 用来测试时间的action
 * */
public class TimerInterceptorAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public TimerInterceptorAction() {
	}

	@Override
	public String execute() throws Exception {
		try {
			// 模拟耗时的操作
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

}
