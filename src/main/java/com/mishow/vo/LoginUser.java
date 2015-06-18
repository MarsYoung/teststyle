package com.mishow.vo;

import java.util.HashMap;
import java.util.Map;


public class LoginUser {
	
	public Map<String, String> getUsertypes() {
		Map<String, String> usertypes = new HashMap<String, String>();
		usertypes.put("TEACHER", "Teacher");
		usertypes.put("STUDENT", "Student");
		usertypes.put("MANAGER", "Manager");
		return usertypes;
	}
	
}
