<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>" />
<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/user.js"></script>
<script type="text/javascript">
	function load() {
		$(document).ready(function(){
			  $("#middle").load("/teststyle/jsp/question/updatequestiondiv.jsp");
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
		<div id="middle">
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

