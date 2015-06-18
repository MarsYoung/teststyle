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
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>" />
<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/user.js"></script>
<script type="text/javascript">
	function login() {
		alert("hahas");
		var username = $("#username").val();
		username = encodeURIComponent(encodeURIComponent(username));
		var password = $("#password").val();
		password = encodeURIComponent(encodeURIComponent(password));
		//var usertype=$('#usertype:checked').val();
		var usertype = $("input[name='usertype']:checked").val();
		alert(usertype);
		if (username == null) {
			alert("用户名不能为空");
		} else if (password == null) {
			alert("密码不能为空");
		} else {
			window.location.href = "user/login.action?username=" + username
					+ "&password=" + password + "&usertype=" + usertype;
		}
	}
	
</script>
</head>

<body>
	<div id="container">
		<div id="header">
			<div id="logo"></div>
			<div></div>
		</div>
		<div id="staticheightmiddle">
			<div id="login"
				style="height: auto; width: 400px; margin-right: auto; margin-left: auto; background-color: #D3EBF7;">
				<s:bean id="loginuser" name="com.mishow.vo.LoginUser" />
				<s:form action="login.action" namespace="/user" theme="simple">
					<div id="formcontent">
						<table>
							<tr>
								<td width="120" height="40" align="center" valign="middle"
									style="width: 120px; color: #6600FF;"><span class="STYLE5">身
										份</span></td>
								<td><s:radio list="#loginuser.usertypes" value="'TEACHER'"
										name="usertype" label="身份" /></td>
							</tr>
							<tr>
								<td width="120" height="40" align="center" valign="middle"
									style="width: 120px; color: #6600FF;"><span class="STYLE5">用
										户</span></td>
								<td><s:textfield name="username" label="用户"></s:textfield></td>
							</tr>
							<tr>
								<td width="120" height="40" align="center" valign="middle"
									style="width: 120px; color: #6600FF;"><span class="STYLE5">密
										码</span></td>
								<td><s:password name="password" label="密码"></s:password></td>
							</tr>
						</table>
					</div>
					<br />
					<div id="formsubmit"
						style="height: 30px; width: 400px; margin-right: auto; margin-left: auto; background-color: #D3EBF7; padding-top: 10px; padding-bottom: 10px; align: center;">

						<div
							style="width: 200px; padding-left: 20px; margin-right: 30px; float: right;">

							<div align="left">
								<!--  <input name="register" type="button" value="注  册" style="color:#6600FF;font-size: 20px" onclick="window.location.href='/teststyle/jsp/user/register.jsp'"/> -->
								<input name="submit" type="submit" value="登  录"
									style="color: #6600FF; font-size: 20px;" />
							</div>
						</div>
					</div>
				</s:form>
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

