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
					onclick="javascript:window.location.href='/teststyle/question/getCurrentPageQuestionListByUsername.action'">我的试题</li>
				<li
					onclick="javascript:window.location.href='/teststyle/jsp/question/add/addquestion.jsp'">添加试题</li>
				<li>查找试题</li>
				<li
					onclick="javascript:window.location.href='/teststyle/user/logout.action'">退出</li>
			</ul>
		</div>
		<div id="middle">
			<div id="myquestion"
				style="height: auto; width: 800px; margin-right: auto; margin-left: auto; background-color: #D3EBF7;">
				我的试题：
				<hr color="red">
				<table>
					<c:choose>
						<c:when test="${not empty pager.list }">
							<c:forEach items="${pager.list }" var="item" varStatus="status">
								<tr>
									<td>问题ID</td>
									<td>${item.id}</td>
								</tr>
								<tr>
									<td>问题类型</td>
									<td>${item.questiontypeString}</td>
								</tr>
								<tr>
									<td>问题内容</td>
									<td>${item.questioncontent}</td>
								</tr>
								<tr>
									<td>问题提交者</td>
									<td>${item.questioncommitter}</td>
								</tr>
								<tr>
									<td>问题提交用户</td>
									<td>${item.questioncommitterid}</td>
								</tr>
								<tr>
									<td>问题来源</td>
									<td>${item.questionfrom}</td>
								</tr>
								<tr>
									<td><a
										href="/teststyle/question/delete.action?id=${item.id}">删除</a></td>
									<td><a
										href="/teststyle/question/gotoupdatepage.action?id=${item.id}">更新</a></td>
								</tr>
								<tr>
									<td><hr color="white"></td>
									<td><hr color="white"></td>
								</tr>

							</c:forEach>
						</c:when>
						<c:otherwise>
								没有记录可显示！
						</c:otherwise>
					</c:choose>
				</table>
				<pg:pager items="${pager.maxElements }" url="${pager.url }"
					maxIndexPages="${pager.maxIndexPages }"
					maxPageItems="${pager.pageSize }">
					<pg:index>
						<pg:first>
							<a href="javascript:void(0)"
								onclick="changeQuestionPage('${pageUrl }')" style="color: green">首页</a>
						</pg:first>
						<pg:prev>
							<a href="javascript:void(0)"
								onclick="changeQuestionPage('${pageUrl }' )"
								style="color: green">上一页</a>
						</pg:prev>
						<pg:pages>
							<c:choose>
								<c:when test="${pager.pageNumber eq pageNumber}">
									<a href="javascript:void(0)"
										onclick="changeQuestionPage('${pageUrl }')"
										style="color: white">${pageNumber }</a>
								</c:when>
								<c:otherwise>
									<a href="javascript:void(0)"
										onclick="changeQuestionPage('${pageUrl }')"
										style="color: green">${pageNumber }</a>
								</c:otherwise>
							</c:choose>
						</pg:pages>
						<pg:next>
							<a href="javascript:void(0)"
								onclick="changeQuestionPage('${pageUrl }')" style="color: green">下一页</a>
						</pg:next>
						<pg:last>
							<a href="javascript:void(0)"
								onclick="changeQuestionPage('${pageUrl }')" style="color: green">末页</a>
						</pg:last>
					</pg:index>
				</pg:pager>
				共${pager.total }页 ${pager.maxElements }条
			</div>
			<div id="addquestion"
				style="height: auto; width: 800px; margin-right: auto; margin-left: auto; background-color: #D3EBF7; padding-top: 20px; padding-bottom: 20px;">
				<a href="/teststyle/jsp/question/add/addquestion.jsp"
					style="color: red">添加题目到系统中</a>
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

