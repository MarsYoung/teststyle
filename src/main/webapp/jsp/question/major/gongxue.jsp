<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.mishow.constants.Subjects"%>
<%@ page import="com.mishow.vo.SubjectsList"%>
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
	function subjectdivchange() {
		$("#subjectdiv").load(
				"/teststyle/question/getSubjectsListByMajor.action?major="
						+ $("#questionmajor").val());
	}
</script>
<style type="text/css">
<!--
.STYLE1 {
	font-family: "宋体";
	font-weight: bold;
	font-size: 18px;
	color: #CC0066;
}

.STYLE2 {
	font-family: "宋体";
	font-weight: bold;
	font-size: 18px;
	color: #CC0066;
}
-->
</style>
</head>
<div>
	<div class="STYLE2">
		请输入专业分类: <select id="questionmajor" name="questionmajor" onchange="subjectdivchange()">
			<c:forEach var="item" items="<%=new SubjectsList().getGongXueSubjects()%>">
				<c:choose>
					<c:when test="${item.key eq '哲学'}">
						<option value="${item.key}" selected="selected">${item.key}</option>
					</c:when>
					<c:otherwise>
						<option value="${item.key}">${item.key}</option>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<option value="12">其它</option>
		</select>
	</div>
</div>
</body>
</html>
