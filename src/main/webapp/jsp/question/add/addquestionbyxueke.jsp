<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.mishow.constants.*"%>
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
	function majortypeclick() {
		var param = $("#majortype").val();
		//alert($("#majortype").val());
		//alert($("#majortype").find("option:selected").text());
		//alert(param);
		//alert(param == "哲学");//不能用equals
		if (param == "哲学") {
			$('#major').load("/teststyle/jsp/question/major/zhexue.jsp");
		} else if (param == "经济学") {
			$('#major').load("/teststyle/jsp/question/major/jingjixue.jsp");
		} else if (param == "法学") {
			$('#major').load("/teststyle/jsp/question/major/faxue.jsp");
		} else if (param == "教育学") {
			$('#major').load("/teststyle/jsp/question/major/jiaoyuxue.jsp");
		} else if (param == "文学") {
			$('#major').load("/teststyle/jsp/question/major/wenxue.jsp");
		} else if (param == "历史学") {
			$('#major').load("/teststyle/jsp/question/major/lishixue.jsp");
		} else if (param == "理学") {
			$('#major').load("/teststyle/jsp/question/major/lixue.jsp");
		} else if (param == "农学") {
			$('#major').load("/teststyle/jsp/question/major/nongxue.jsp");
		} else if (param == "军事学") {
			$('#major').load("/teststyle/jsp/question/major/junshixue.jsp");
		} else if (param == "管理学") {
			$('#major').load("/teststyle/jsp/question/major/guanlixue.jsp");
		} else if (param == "工学") {
			$('#major').load("/teststyle/jsp/question/major/gongxue.jsp");
		} else if (param == "医学") {
			$('#major').load("/teststyle/jsp/question/major/yixue.jsp");
		}

	};

	function loadmajor() {
		$(document).ready(function() {
			$('#major').load("/teststyle/jsp/question/major/zhexue.jsp");
		});

	};

	function clickradio() {
		var isbasicsubject = $("#isbasicsubject:checked").val();
		//alert(isbasicsubject);
		if (isbasicsubject == 1) {
			//是基础课
			$("#selectmajor").hide();
			$("#major").hide();
			$("#subjectdiv").load("/teststyle/jsp/question/major/basicsubjectlist.jsp");
		} else {
			//不是基础课
			$("#selectmajor").show();
			$("#major").show();
			$("#subjectdiv").load(
					"/teststyle/question/getSubjectsListByMajor.action?major="
							+ $("#questionmajor").val());
		}
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

<body onload="loadmajor()">
	<!-- 写在这里没用 -->
	<font color="green" size="3">是否专业课</font>
	<input id="isbasicsubject" type="radio" name="isbasicsubject" value="0" onclick="clickradio()">
	专业课
	<input id="isbasicsubject" type="radio" name="isbasicsubject" value="1" onclick="clickradio()" checked>
	非专业课

	<div id="selectmajor" style="display: none">
		<div class="STYLE2">
			请选择专业范围: <select id="majortype" name="majortype" onchange="majortypeclick()">
				<c:forEach var="item" items="<%=Subjects.subjects%>">
					<c:choose>
						<c:when test="${item.key eq '哲学'}">
							<option value="${item.key}" selected="selected">${item.key}</option>
						</c:when>
						<c:otherwise>
							<option value="${item.key}">${item.key}</option>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</select>
		</div>
		<div id="major" style="display: none"></div>
	</div>
	<div class="STYLE2">
		请选择学科范围:
		<div id="subjectdiv">
			<select id="questionsubject" name="questionsubject">
				<c:forEach var="item" items="<%=QuestionConstants.questionBasicSubjectMap%>">
					<option value="${item.key}">${item.value}</option>
				</c:forEach>
			</select>
		</div>
		<input name="questionsubjectOther" type="text" value="" size="20" maxlength="20" />
	</div>


</body>
</html>
