package com.mishow.filter;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class AuthorizationInterceptor extends AbstractInterceptor {
	private static final Log log = LogFactory
			.getLog(AuthorizationInterceptor.class);
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		/*
		 * 检查session是否存在键为“ROLE”的字符串，判断用户是否登陆。如果用户已经登陆，将角色放到Action中，调用Action；否则，
		 * 拦截直接返回Action.LOGIN字段。
		 */
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		String role = (String) session.get("ROLE");
		if (null != role) {
			log.info("用户类型为"+role+"的用户在进行操作！");
			Object o = invocation.getAction();
			if (o instanceof RoleAware) {
				RoleAware action = (RoleAware) o;
				action.setRole(role);
			}
			return invocation.invoke();
		}
		log.info("用户类型为NULL的用户在进行操作！");
		return Action.LOGIN;
	}

}
