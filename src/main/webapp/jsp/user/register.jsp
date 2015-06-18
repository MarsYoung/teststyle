<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>TestStyle</title>
<link href="/teststyle/css/layout.css" rel="stylesheet" type="text/css" />
<meta name="Keywords" content="TestStyle,Test,Style" />
<meta name="" content="TestStyle" />
<meta name="author" content="marsyoung" />
<meta name="Description" content="indexpage" />
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>" />
<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/user.js"></script>

</head>

<body>
	<div id="container">
		<div id="header">
			<div id="logo"></div>
			<div></div>
		</div>
		<div id="middle">
			<div id="register"
				style="height: auto; width: 400px; margin-right: auto; margin-left: auto; padding-top: 100px;padding-bottom: 200px">
				<font color="red" size="20">用户注册</font>
				<hr color="green">
				<s:bean id="loginuser" name="com.mishow.vo.LoginUser" />
				<s:form action="register.action" namespace="/user">
					<div id="formcontent">
						<s:hidden name="usertype" value="STUDENT"></s:hidden>
						<s:textfield name="username" label="用户名"></s:textfield>
						<s:password name="password" label="密码"></s:password>
						<s:password name="repeatpassword" label="再次输入密码"></s:password>
						<s:textfield name="realname" label="真实姓名"></s:textfield>
						<s:radio name="gender" list="#{0:'女',1:'男'}" label="性别"></s:radio>
						<s:textfield name="number" label="学号或工号"></s:textfield>
						<s:textfield name="department" label="所在部门"></s:textfield>
					</div>
					<div id="formsubmit">
						<s:submit value="注册" theme="simple" />
						<s:reset value="清空" theme="simple" />
					</div>
				</s:form>
			</div>
		</div>

		<div id="footer">
			Test Style
			<div id="copyright">Copy Right @ Tian Jin University Of
				Commerce</div>
			<div id="author">Author @ MarsYoung</div>
		</div>

	</div>
</body>
</html>

