<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="pg" uri="http://jsptags.com/tags/navigation/pager"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.mishow.vo.SubjectsList,com.mishow.constants.Subjects"%>
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
	function getQuestionByMajor(major){
		//alert($('[name^=zheXueSubjects]:checked').val());
		
		window.location.href='/teststyle/question/getSubjectsIndexListByMajor.action?major='+major;
		
	}
</script>
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
					onclick="javascript:window.location.href='/teststyle/question/getCurrentPageQuestionList.action'">查找试题</li>
				<li
					onclick="javascript:window.location.href='/teststyle/user/logout.action'">退出</li>
			</ul>
		</div>
		<div id="middle">
			<div id="question"
				style="height: auto; width: 800px; margin-right: auto; margin-left: auto; background-color: #D3EBF7;">
				<div id="searchquestion">
					<font color="red">试题科目列表</font>：
					<hr color="red">
					<s:bean id="subjectslist" name="com.mishow.vo.SubjectsList" />
					<br>
					<font color="green">哲学</font>
					<hr color="white">
					<s:radio list="#subjectslist.zheXueSubjects" name="zheXueSubjects" onclick="getQuestionByMajor($('[name^=zheXueSubjects]:checked').val())"/>
					<br>
					<font color="green">经济学</font>
					<hr color="white">
					<s:radio list="#subjectslist.jingjiXueSubjects" name="jingjiXueSubjects" onclick="getQuestionByMajor($('[name^=jingjiXueSubjects]:checked').val())"/>
					<br>
					<font color="green">法学</font>
					<hr color="white">
					<s:radio list="#subjectslist.faXueSubjects" name="faXueSubjects" onclick="getQuestionByMajor($('[name^=faXueSubjects]:checked').val())"/>
					<br>
					<font color="green">教育学</font>
					<hr color="white">
					<s:radio list="#subjectslist.jiaoyuXueSubjects" name="jiaoyuXueSubjects" onclick="getQuestionByMajor($('[name^=jiaoyuXueSubjects]:checked').val())"/>
					<br>
					<font color="green">文学</font>
					<hr color="white">
					<s:radio list="#subjectslist.wenXueSubjects" name="wenXueSubjects" onclick="getQuestionByMajor($('[name^=wenXueSubjects]:checked').val())"/>
					<br>
					<font color="green">历史学</font>
					<hr color="white">
					<s:radio list="#subjectslist.lishiXueSubjects" name="lishiXueSubjects" onclick="getQuestionByMajor($('[name^=lishiXueSubjects]:checked').val())"/>
					<br>
					<font color="green">力学</font>
					<hr color="white">
					<s:radio list="#subjectslist.liXueSubjects" name="liXueSubjects" onclick="getQuestionByMajor($('[name^=liXueSubjects]:checked').val())"/>
					<br>
					<font color="green">工学</font>
					<hr color="white">
					<s:radio list="#subjectslist.gongXueSubjects" name="gongXueSubjects" onclick="getQuestionByMajor($('[name^=gongXueSubjects]:checked').val())"/>
					<br>
					<font color="green">农学</font>
					<hr color="white">
					<s:radio list="#subjectslist.nongXueSubjects" name="nongXueSubjects" onclick="getQuestionByMajor($('[name^=nongXueSubjects]:checked').val())"/>
					<br>
					<font color="green">医学</font>
					<hr color="white">
					<s:radio list="#subjectslist.yiXueSubjects" name="yiXueSubjects" onclick="getQuestionByMajor($('[name^=yiXueSubjects]:checked').val())"/>
					<br>
					<font color="green">军事学</font>
					<hr color="white">
					<s:radio list="#subjectslist.junshiXueSubjects" name="junshiXueSubjects" onclick="getQuestionByMajor($('[name^=junshiXueSubjects]:checked').val())"/>
					<br>
					<font color="green">管理学</font>
					<hr color="white">
					<s:radio list="#subjectslist.guanliXueSubjects" name="guanliXueSubjects" onclick="getQuestionByMajor($('[name^=guanliXueSubjects]:checked').val())"/>
					<br>
				</div>
				<hr color="white">
				<font color="red">所有试题：</font>
				<hr color="red">
				<div></div>
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

