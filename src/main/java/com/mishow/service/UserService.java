package com.mishow.service;


import java.util.List;

import com.mishow.exception.UserException;
import com.mishow.po.User;

/**
 * 分装用户独特于模型marsservice的一般业务
 * 
 * @author marsyoung
 * 
 */
public interface UserService {
	public int login(User user);
	public int register(User user,String number,String department, String subject) throws UserException;
	public int getNum(User user);
	public User getUser(String username);
	public String getDepartment(User user);
	public int getTotalNumByUsername(String username);
	public int getTotalNum();
	public List<User> getCurrentPageList(int offset);
	public List<User> getCurrentPageListBySubject(int offset, String username);
	public int getTotalNumByDepartment(String department);
	public List<User> getCurrentPageListByDepartment(int offset, String department);
	public int getTotalNumByUsertype(String usertype);
	public List<User> getCurrentPageListByUsertype(int offset, String usertype);
	public Object getUserDetailByUsernameAndUsertype(String username, String usertypeStr);
	public int update(User user, String number, String department, String subject);
	public void delete(String username);
	
	
}
