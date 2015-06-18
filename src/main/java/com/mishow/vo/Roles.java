package com.mishow.vo;

import java.util.HashMap;
import java.util.Map;

public class Roles {
	public Map<String, String> getRoles() {
		Map<String, String> roles = new HashMap<String, String>();
		roles.put("TEACHER", "Teacher");
		roles.put("STUDENT", "Student");
		roles.put("MANAGER", "Manager");
		return roles;
	}
}
