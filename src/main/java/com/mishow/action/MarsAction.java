package com.mishow.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mishow.vo.Pagination;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.Preparable;

/**
 * MarsAction是各个类的父类，定义了个各类共用的参数和方法
 * **/
@Scope("prototype")
@Controller
public abstract class MarsAction implements Action, Preparable, SessionAware {
	protected final Log log = LogFactory.getLog(getClass());
	protected Map<String, Object> session;// action的session
	protected int userID; // 用户ID
	protected String role; // 用户种类
	protected int id; // 各种实体的id
	protected int pagerOffset = 0; // 实际上对应于请求参数pager.offset，该参数表示该页第一条记录在总记录中的偏移量
	protected Pagination pager; // 分页对象

	protected String resp; // 返回给浏览器的JSON字符串
	protected String basePath; // jsp页面指定相对路径用

	public MarsAction() {
		super();
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public String execute() throws Exception {
		return null;
	}

	@Override
	public void prepare() {
		// 设置pagerOffset的值为请求参数pager.offset的值
		HttpServletRequest request = ServletActionContext.getRequest();
		if (request.getParameter("pager.offset") != null) {// pager.offset，taglib标签自带的属性
			pagerOffset = Integer.parseInt(request.getParameter("pager.offset"));
		}
		basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath() + "/";
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPagerOffset() {
		return pagerOffset;
	}

	public void setPagerOffset(int pagerOffset) {
		this.pagerOffset = pagerOffset;
	}

	public Pagination getPager() {
		return pager;
	}

	public void setPager(Pagination pager) {
		this.pager = pager;
	}

	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
