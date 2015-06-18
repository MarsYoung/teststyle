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
		<div id="menu">
			<ul>
				<li
					onclick="javascript:window.location.href='/teststyle/user/login.action'">首
					页</li>
				<li
					onclick="javascript:window.location.href='/teststyle/user/getCurrentPageUserListByUsertype.action?usertype=TEACHER'">教师列表</li>
				<li
					onclick="javascript:window.location.href='/teststyle/jsp/teacher/add/addteacher.jsp'">添加教师</li>
				<li
					onclick="javascript:window.location.href='/teststyle/user/getCurrentPageUserListByUsertype.action?usertype=STUDENT'">学生列表</li>
				<li
					onclick="javascript:window.location.href='/teststyle/jsp/student/add/addstudent.jsp'">添加学生</li>
				<li
					onclick="javascript:window.location.href='/teststyle/question/getCurrentPageQuestionList.action'">查找试题</li>
						<li
					onclick="javascript:window.location.href='/teststyle/jsp/manager/systeminfolist.jsp'">系统公告</li>
				<li
					onclick="javascript:window.location.href='/teststyle/user/logout.action'">退出</li>
			</ul>
		</div>
		<div id="middle">
			<div id="register"
				style="height: auto; width: 400px; margin-right: auto; margin-left: auto; padding-top: 100px;padding-bottom: 200px">
				<font color="red" size="20">更新学生信息</font>
				<hr color="green">
				<s:bean id="loginuser" name="com.mishow.vo.LoginUser" />
				<s:form action="update.action" namespace="/user">
					<div id="formcontent">
						<s:textfield name="usertype" label="用户类型" value="STUDENT" readonly="true"></s:textfield>
						<s:textfield name="username" label="用户名"></s:textfield>
						<s:password name="password" label="密码"></s:password>
						<s:password name="repeatpassword" label="再次输入密码"></s:password>
						<s:textfield name="realname" label="真实姓名"></s:textfield>
						<s:radio name="gender" list="#{0:'女',1:'男'}" label="性别"></s:radio>
						<s:textfield name="number" label="学号"></s:textfield>
						<s:textfield name="department" label="所在班级"></s:textfield>
					</div>
					<div id="formsubmit">
						<s:submit value="更新" theme="simple" />
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

