package com.mishow.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mishow.action.UserAction;
import com.mishow.po.User;
import com.mishow.service.UserService;

/**
 * @author marsyoung
 * 
 */
public class TestSSHDao{

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/spring.xml");
		UserService userService = (UserService) applicationContext.getBean("userService",
				UserService.class);
		userService.login(new User());

		UserAction action=(UserAction) applicationContext.getBean("userAction",
				UserAction.class);
		User u=new User();
		u.setUsername("马志宇");
		u.setPassword("123");
		u.setId(1);
		action.setUser(u);
		//action.login();
		System.out.println(action.login());
//		UserService service=(UserServiceImpl) applicationContext.getBean("userService",
//				UserServiceImpl.class);
		
		
		
	}
}
