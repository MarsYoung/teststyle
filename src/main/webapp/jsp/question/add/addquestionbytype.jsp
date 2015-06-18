<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>TestStyle</title>
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
</script>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 18px;
	color: #CC0066;
}
-->
</style>
</head>

<body>
	<div class="STYLE1">
		选择所要添加题库的类型 <select id="questiontypeselect" name="questiontype" onchange="change()">
			<option value="1">填空题</option>
			<option value="2">选择题</option>
			<option value="3">简答题</option>
			<option value="4">问答题</option>
			<option value="5">判断题</option>
			<option value="6">综合题</option>
		</select>
	</div>
</body>
</html>
