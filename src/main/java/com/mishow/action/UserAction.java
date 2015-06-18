package com.mishow.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mishow.constants.Constants;
import com.mishow.exception.UserException;
import com.mishow.po.Student;
import com.mishow.po.Teacher;
import com.mishow.po.User;
import com.mishow.service.UserService;
import com.mishow.util.ActionReturnDataUtil;
import com.mishow.vo.Pagination;

@Scope("prototype")
@Controller
public class UserAction extends MarsAction {
	protected final Log log = LogFactory.getLog(getClass());
	User user;
	String username;
	String password;
	String repeatpassword;
	String usertype;
	String realname;
	String gender;
	String number;
	String subject;

	String department;
	@Resource(name = "userService")
	UserService userService;

	public UserAction() {
		log.debug("useraction is initial!");
	}

	UserService getUserService() {
		return userService;
	}

	@Required
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeatpassword() {
		return repeatpassword;
	}

	public void setRepeatpassword(String repeatpassword) {
		this.repeatpassword = repeatpassword;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String login() {
		System.out.println(session.get("loginuser"));
		System.out.println(user);
		User loginuser = (User) session.get("loginuser");
		if (session.get("loginuser") == null) {
			if (username != null && password != null && usertype != null) {
				user = new User();
				user.setUsername(username);
				user.setPassword(password);
				user.setUsertype(usertype);
				if (userService.login(user) == 1) {
					try {
						// 返回resp字符串，可以从其中取到返回的用户信息
						resp = ActionReturnDataUtil.returnSUCESS(user.getJSONString());
					} catch (JSONException e) {
						e.printStackTrace();
					}
					// 是指返回的一些属性
					setNumber("" + userService.getNum(user));
					setRealname(userService.getUser(username).getRealname());
					setDepartment(userService.getDepartment(user));
					// 记录登录用户的各个属性
					user.setRealname(userService.getUser(username).getRealname());
					System.out.println(username + "登陆成功");
					session.put("loginuser", user);
					return SUCCESS + "_" + usertype;
				} else {
					System.out.println(username + "登陆失败");
					return LOGIN;
				}
			} else {
				System.out.println(username + "用户登陆信息为空 ,登陆失败");
				return LOGIN;
			}
		} else {
			// login user 不为空的时候
			System.out.println(loginuser.getUsername() + loginuser.getUsertype() + loginuser.getRealname());
			user = new User();
			user.setUsername(loginuser.getUsername());
			user.setUsertype(loginuser.getUsertype());
			user.setRealname(loginuser.getRealname());
			setDepartment(userService.getDepartment(loginuser));
			setNumber("" + userService.getNum(loginuser));
			return SUCCESS + "_" + loginuser.getUsertype();
		}
	}

	public String register() {
		if (username != null && password != null && repeatpassword != null && usertype != null && realname != null
				&& gender != null) {
			user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setUsertype(usertype);
			user.setRealname(realname);
			if (gender.equals("1")) {
				user.setGender(1);
			} else if (gender.equals("1")) {
				user.setGender(0);
			}
			try {
				if (userService.register(user, number, department, subject) == 1) {
					System.out.println(username + "注册成功");
					return SUCCESS;
				} else {
					System.out.println(username + "注册失败");
					return LOGIN;
				}
			} catch (UserException e) {
				log.info(e);
				return LOGIN;
			}
		} else {
			System.out.println("用户注册信息为空 ,注册失败");
			return LOGIN;
		}

	}

	public String adduser() {
		if (username != null && password != null && repeatpassword != null && usertype != null && realname != null
				&& gender != null) {
			user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setUsertype(usertype);
			user.setRealname(realname);
			if (gender.equals("1")) {
				user.setGender(1);
			} else if (gender.equals("1")) {
				user.setGender(0);
			}
			try {
				if (userService.register(user, number, department, subject) == 1) {
					System.out.println(username + "注册成功");
					return SUCCESS;
				} else {
					System.out.println(username + "注册失败");
					return LOGIN;
				}
			} catch (UserException e) {
				log.info(e);
				return LOGIN;
			}
		} else {
			System.out.println("用户注册信息为空 ,注册失败");
			return LOGIN;
		}

	}
	
	public String update() {
		if (username != null && password != null && repeatpassword != null && usertype != null && realname != null
				&& gender != null) {
			user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setUsertype(usertype);
			user.setRealname(realname);
			if (gender.equals("1")) {
				user.setGender(1);
			} else if (gender.equals("1")) {
				user.setGender(0);
			}
			if (userService.update(user, number, department, subject) == 1) {
				System.out.println(username + "更新成功");
				return SUCCESS;
			} else {
				System.out.println(username + "更新失败");
				return ERROR;
			}
		} else {
			System.out.println("用户更新信息为空 ,更新失败");
			return LOGIN;
		}

	}
	
	public String delete(){
		userService.delete(username);
		return SUCCESS;
	}

	public String logout() {
		session.remove("loginuser");
		return SUCCESS;

	}

	public String getCurrentPageUserList() {
		/*
		 * 构造分页对象
		 */
		pager = new Pagination(Constants.USER_PAGE_SIZE, userService.getTotalNum(), pagerOffset);
		List<User> userList = userService.getCurrentPageList(pager.getOffset());
		pager.setList(userList);
		pager.setUrl(Constants.USER_BASE_URL);
		return SUCCESS;
	}

	public String getCurrentPageUserListBySubject() {
		/*
		 * 构造分页对象
		 */
		User u = (User) session.get("loginuser");
		pager = new Pagination(Constants.USER_PAGE_SIZE, userService.getTotalNumByUsername(u.getUsername()),
				pagerOffset);
		List<User> userList = userService.getCurrentPageListBySubject(pager.getOffset(), u.getUsername());
		pager.setList(userList);
		pager.setUrl(Constants.USER_BY_SUBJECT_URL);
		return SUCCESS;
	}

	public String getCurrentPageUserListByDepartment() {
		/*
		 * 构造分页对象
		 */
		pager = new Pagination(Constants.USER_PAGE_SIZE, userService.getTotalNumByDepartment(department), pagerOffset);
		List<User> userList = userService.getCurrentPageListByDepartment(pager.getOffset(), department);
		pager.setList(userList);
		pager.setUrl(Constants.USER_BY_SUBJECT_URL);
		return SUCCESS;
	}

	public String getCurrentPageUserListByUsertype() {
		/*
		 * 构造分页对象
		 */
		pager = new Pagination(Constants.USER_PAGE_SIZE, userService.getTotalNumByUsertype(usertype), pagerOffset);
		List<User> userList = userService.getCurrentPageListByUsertype(pager.getOffset(), usertype);
		pager.setList(userList);
		pager.setUrl(Constants.USER_BY_SUBJECT_URL);
		return SUCCESS + "_" + usertype;
	}

	public String getUserDetailByUsernameAndUsertype() {
		if (usertype.equals("STUDENT")) {
			User u = userService.getUser(username);
			setId(u.getId());
			setUsername(username);
			setUsertype(usertype);
			setGender(u.getGender() + "");
			Student st = (Student) userService.getUserDetailByUsernameAndUsertype(username, usertype);
			setNumber(st.getStudentnum() + "");
			setDepartment(st.getClassname());
		} else if (usertype.equals("TEACHER")) {
			User u = userService.getUser(username);
			setId(u.getId());
			setUsername(username);
			setUsertype(usertype);
			setGender(u.getGender() + "");
			Teacher te = (Teacher) userService.getUserDetailByUsernameAndUsertype(username, usertype);
			setNumber(te.getTeachernum() + "");
			setDepartment(te.getTeacherdepartment());
			setSubject(te.getSubject());
		}
		return SUCCESS + "_" + usertype;
	}

	public String gotoupdatepage() {
		if (usertype.equals("STUDENT")) {
			User u = userService.getUser(username);
			setId(u.getId());
			setUsername(username);
			setUsertype(usertype);
			setGender(u.getGender() + "");
			Student st = (Student) userService.getUserDetailByUsernameAndUsertype(username, usertype);
			setNumber(st.getStudentnum() + "");
			setDepartment(st.getClassname());
		} else if (usertype.equals("TEACHER")) {
			User u = userService.getUser(username);
			setId(u.getId());
			setUsername(username);
			setUsertype(usertype);
			setGender(u.getGender() + "");
			Teacher te = (Teacher) userService.getUserDetailByUsernameAndUsertype(username, usertype);
			setNumber(te.getTeachernum() + "");
			setDepartment(te.getTeacherdepartment());
			setSubject(te.getSubject());
		}
		return SUCCESS + "_" + usertype;
	}
	

}
