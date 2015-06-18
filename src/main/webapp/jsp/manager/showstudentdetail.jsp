<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="pg" uri="http://jsptags.com/tags/navigation/pager"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<div id="myquestion"
				style="height: auto; width: 800px; margin-right: auto; margin-left: auto; background-color: #D3EBF7;">
				<font color="red" size="6px">用户${username}的详细信息</font>
				<hr color="green">
				<table>
					<tr>
						<td>用户ID：</td>
						<td>${id}</td>
					</tr>
					<tr>
						<td>用户昵称：</td>
						<td>${username}</td>
					</tr>
					<tr>
						<td>用户类型：</td>
						<td>${usertype}</td>
					</tr>
					<tr>
						<td>学生性别：</td>
						<td>${gender}</td>
					</tr>
					<tr>
						<td>学生学号：</td>
						<td>${number}</td>
					</tr>
					<tr>
						<td>所在学院：</td>
						<td>${department}</td>
					</tr>
				</table>
			</div>
		</div>
		<div id="footer">
			Test Style
			<div id="copyright">Copy Right © Tian Jin University Of
				Commerce</div>
			<div id="author">Author © MarsYoung</div>
		</div>

	</div>
</body>
</html>

