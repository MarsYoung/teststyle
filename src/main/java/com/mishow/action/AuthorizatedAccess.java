package com.mishow.action;

import com.mishow.filter.RoleAware;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 用作权限测试的actoin
 * */
public class AuthorizatedAccess extends ActionSupport implements RoleAware {

	private static final long serialVersionUID = 1L;
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role=role;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
