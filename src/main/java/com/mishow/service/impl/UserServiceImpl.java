/**
 * 
 */
package com.mishow.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.mishow.constants.Constants;
import com.mishow.constants.UserConstants;
import com.mishow.dao.ManagerDao;
import com.mishow.dao.StudentDao;
import com.mishow.dao.TeacherDao;
import com.mishow.dao.UserDao;
import com.mishow.exception.UserException;
import com.mishow.po.Manager;
import com.mishow.po.Student;
import com.mishow.po.Teacher;
import com.mishow.po.User;
import com.mishow.service.UserService;

/**
 * 实现所有用户的一般业务
 * 
 * @author mshootingstar
 * @param <M>
 * 
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name = "userDao")
	UserDao userDao;

	@Resource(name = "studentDao")
	StudentDao studentDao;

	@Resource(name = "teacherDao")
	TeacherDao teacherDao;

	@Resource(name = "managerDao")
	ManagerDao managerDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int login(User user) {
		User userpo = (User) userDao.getByUserName(user.getUsername());
		if (null != userpo && userpo.getUsername().equals(user.getUsername())
				&& userpo.getPassword().equals(user.getPassword())) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int register(User user, String number, String department, String subject) throws UserException {
		User userpo = (User) userDao.getByUserName(user.getUsername());
		if (null != userpo) {
			throw new UserException(UserConstants.ERROR_EXIST_USER);
		} else {
			userDao.save(user);
			if (user.getUsertype().equals("STUDENT")) {
				Student st = new Student();
				st.setStudentnum(Integer.valueOf(number));
				st.setUsername(user.getUsername());
				st.setClassname(department);
				studentDao.save(st);
			} else if (user.getUsertype().equals("TEACHER")) {
				Teacher te = new Teacher();
				te.setTeachernum(Integer.valueOf(number));
				te.setUsername(user.getUsername());
				te.setTeacherdepartment(department);
				te.setSubject(subject);
				teacherDao.save(te);
			} else if (user.getUsertype().equals("MANAGER")) {
				Manager ma = new Manager();
				ma.setManagernum(Integer.valueOf(number));
				ma.setUsername(user.getUsername());
				ma.setManagerdepartment(department);
				managerDao.save(ma);
			}
			return 1;
		}
	}

	@Override
	public int getNum(User user) {
		switch (user.getUsertype()) {
		case "STUDENT":
			return studentDao.getByUserName(user.getUsername()).getStudentnum();
		case "TEACHER":
			return teacherDao.getByUserName(user.getUsername()).getTeachernum();
		case "MANAGER":
			return managerDao.getByUserName(user.getUsername()).getManagernum();
		default:
			return 0;
		}

	}

	@Override
	public User getUser(String username) {
		return (User) userDao.getByUserName(username);
	}

	@Override
	public String getDepartment(User user) {
		switch (user.getUsertype()) {
		case "STUDENT":
			return studentDao.getByUserName(user.getUsername()).getClassname();
		case "TEACHER":
			return teacherDao.getByUserName(user.getUsername()).getTeacherdepartment();
		case "MANAGER":
			return managerDao.getByUserName(user.getUsername()).getManagerdepartment();
		default:
			return null;
		}
	}

	@Override
	public int getTotalNumByUsername(String username) {
		// 还得这么转化
		String longst = "" + userDao.getTotalNumByUsername(username);
		return Integer.valueOf(longst);

	}

	@Override
	public int getTotalNum() {
		// 还得这么转化
		String longst = "" + userDao.getTotalNum();
		return Integer.valueOf(longst);
	}

	@Override
	public List<User> getCurrentPageList(int offset) {
		return userDao.getCurrentPageListDesc(offset, Constants.USER_PAGE_SIZE);
	}

	@Override
	public List<User> getCurrentPageListBySubject(int offset, String subject) {

		return teacherDao.getCurrentPageListBySubjectDesc(offset, Constants.USER_PAGE_SIZE, subject);
	}

	@Override
	public int getTotalNumByDepartment(String department) {
		// 还得这么转化
		String longst = "" + userDao.getTotalNumByDepartment(department);
		return Integer.valueOf(longst);
	}

	@Override
	public List<User> getCurrentPageListByDepartment(int offset, String department) {
		return userDao.getCurrentPageListByDepartmentDesc(offset, Constants.USER_PAGE_SIZE, department);
	}

	@Override
	public int getTotalNumByUsertype(String usertype) {
		// 还得这么转化
		String longst = "" + userDao.getTotalNumByUsertype(usertype);
		return Integer.valueOf(longst);
	}

	@Override
	public List<User> getCurrentPageListByUsertype(int offset, String usertype) {
		return userDao.getCurrentPageListByUsertypeDesc(offset, Constants.USER_PAGE_SIZE, usertype);
	}

	@Override
	public Object getUserDetailByUsernameAndUsertype(String username, String usertypeStr) {
		if (usertypeStr.equals("STUDENT")) {
			return studentDao.getByUserName(username);
		} else if (usertypeStr.equals("TEACHER")) {
			return teacherDao.getByUserName(username);
		} else if (usertypeStr.equals("MANAGER")) {
			return managerDao.getByUserName(username);
		}else{
			return null;
		}
		
		
	}

	@Override
	public int update(User user, String number, String department, String subject) {
		userDao.update(user);
		if (user.getUsertype().equals("STUDENT")) {
			Student st = new Student();
			st.setStudentnum(Integer.valueOf(number));
			st.setUsername(user.getUsername());
			st.setClassname(department);
			studentDao.update(st);
		} else if (user.getUsertype().equals("TEACHER")) {
			Teacher te = new Teacher();
			te.setTeachernum(Integer.valueOf(number));
			te.setUsername(user.getUsername());
			te.setTeacherdepartment(department);
			te.setSubject(subject);
			teacherDao.update(te);
		} else if (user.getUsertype().equals("MANAGER")) {
			Manager ma = new Manager();
			ma.setManagernum(Integer.valueOf(number));
			ma.setUsername(user.getUsername());
			ma.setManagerdepartment(department);
			managerDao.update(ma);
		}
		return 1;
	}

	@Override
	public void delete(String username) {
		User userpo = (User) userDao.getByUserName(username);
		if(null!=userpo){
			if (userpo.getUsertype().equals("STUDENT")) {
				studentDao.delete(username);
			} else if (userpo.getUsertype().equals("TEACHER")) {
				teacherDao.delete(username);
			} else if (userpo.getUsertype().equals("MANAGER")) {
				managerDao.delete(username);
			}
			userDao.delete(username);
		}
	}

}
