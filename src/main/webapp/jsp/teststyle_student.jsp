<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>TestStyle</title>
<!--执行loginaction后的当前目录是localhost:8080
	访问jsp/teststyle.jsp后当前目录是jsp/
	所以link直接写成固定路径
	/代表localhost:8080目录
  -->
<link href="/teststyle/css/layout.css" rel="stylesheet" type="text/css" />
<meta name="Keywords" content="TestStyle,Test,Style" />
<meta name="" content="TestStyle" />
<meta name="author" content="marsyoung" />
<meta name="Description" content="indexpage" />
<!-- request.getContextPath()是为了解决相对路径的问题，可返回站点的根路径。 -->
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>" />
<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/user.js"></script>
<script type="text/javascript">
	function load() {
		$(document)
				.ready(
						function() {
							$("#userinfos")
									.load(
											"/teststyle/userinfo/getCurrentPageUserInfoList.action");
							$("#function").load(
									"/teststyle/jsp/user/functiondiv.jsp");
							$("#mailreminder").load(
									"/teststyle/jsp/user/maildiv.jsp");
							$("#schedulecontent").load(
									"/teststyle/jsp/user/schedulediv.jsp");
							$("#blackboard")
									.load(
											"/teststyle/systeminfo/getCurrentPageSystemInfoList.action");
						});
	}
</script>

</head>

<body onload="load()">
	<div id="container">
		<div id="header">
			<div id="logo"></div>
			<div></div>
		</div>
		<div id="menu">
			<ul>
				<li
					onclick="javascript:window.location.href='/teststyle/jsp/teststyle.jsp'">首
					页</li>
				<li
					onclick="javascript:window.location.href='/teststyle/jsp/student/iwantapaper.jsp'">我要做题</li>
				<li
					onclick="javascript:window.location.href='/teststyle/user/logout.action'">退出</li>
			</ul>
		</div>
		<div id="mainContent">
			<div id="sidebar">
				<div id="usertitle">用户信息</div>
				<div id="userinfo">
					<div id="userpic"></div>
					<div id="userinfocontent">
						<table>
							<tr>
								<td>用户编码：</td>
								<td id="username">${number}</td>
							</tr>
							<tr>
								<td>用户昵称：</td>
								<td id="department">${user.username}</td>
							</tr>
							<tr>
								<td>用户类别：</td>
								<td id="usertype">${user.usertype}</td>
							</tr>
							<tr>
								<td>用户名称：</td>
								<td id="realname">${user.realname}</td>
							</tr>
							<tr>
								<td>用户所在：</td>
								<td id="department">${department}</td>
							</tr>
						</table>

					</div>

				</div>
			</div>
			<div id="sidebar2">
				<div id="mailbox">
					我的通知
					<!-- mailremiderdiv -->
					<div id="mailreminder"></div>
				</div>
				<div id="schedule">
					今日课表
					<!-- schedulecontent -->
					<div id="schedulecontent"></div>
				</div>

			</div>
			<div id="content">
				<div id="systeminfo">
					<div id="welcome">
						欢迎
						<div id="username">${user.username}</div>
						登陆TestStyle系统！
					</div>
					<!--blackboarddiv.jsp  -->
					<div id="blackboard"></div>
				</div>
				<div id="userinfos">
					<!-- userinfo -->
				</div>
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

