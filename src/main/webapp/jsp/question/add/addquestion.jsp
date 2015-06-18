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
	function load() {
		$(document)
				.ready(
						function() {
							$("#addquestionxueke")
									.load(
											"/teststyle/jsp/question/add/addquestionbyxueke.jsp");
							$("#addquestiontype")
									.load(
											"/teststyle/jsp/question/add/addquestionbytype.jsp");
							$("#questioncontentdiv").load(
									"/teststyle/jsp/question/add/tiankong.jsp");
						});
	}

	function change() {
		//alert($("#questiontypeselect").val());
		//添加所需要执行的操作代码 
		var i = $("#questiontypeselect").val(); //获取选中记录的value值 
		//$("#mySelect option:selected").text(); //获取选中记录的text值 
		if (i == 1) {
			$("#questioncontentdiv").load(
					"/teststyle/jsp/question/add/tiankong.jsp");
		} else if (i == 2) {
			$("#questioncontentdiv").load(
					"/teststyle/jsp/question/add/xuanze.jsp");
		} else if (i == 3) {
			$("#questioncontentdiv").load(
					"/teststyle/jsp/question/add/jianda.jsp");
		} else if (i == 4) {
			$("#questioncontentdiv").load(
					"/teststyle/jsp/question/add/wenda.jsp");
		} else if (i == 5) {
			$("#questioncontentdiv").load(
					"/teststyle/jsp/question/add/panduan.jsp");
		} else if (i == 6) {
			$("#questioncontentdiv").load(
					"/teststyle/jsp/question/add/zonghe.jsp");
		}
	};
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

<body onload="load()">
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
					onclick="javascript:window.location.href='/teststyle/question/getCurrentPageQuestionListByUsername.action'">我的试题</li>
				<li
					onclick="javascript:window.location.href='/teststyle/jsp/question/add/addquestion.jsp'">添加试题</li>
								<li onclick="javascript:window.location.href='/teststyle/question/getCurrentPageQuestionList.action'">查找试题</li>
				<li
					onclick="javascript:window.location.href='/teststyle/user/logout.action'">退出</li>
			</ul>
		</div>
		<div id="middle">
			<div
				style="height: auto; width: 700px; margin-right: auto; margin-left: auto; background-color: #D3EBF7;">
				<s:form action="addQuestion.action" namespace="/question"
					theme="simple">
					<div id="addquestionxueke"></div>
					<div id="addquestiontype"></div>
					<div id="questioncontentdiv"></div>
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

