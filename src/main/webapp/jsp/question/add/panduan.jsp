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
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>" />
<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/user.js"></script>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 18px
}

.STYLE2 {
	font-size: 18px;
	font-weight: bold;
}
-->
</style>
</head>

<body>
	<div>
		<tr>
			<td width="120" align="center" valign="middle"
				style="width: 120px; color: #6600FF;"><span
				class="STYLE5 STYLE1"><strong>题 目</strong></span></td>
			<td width="300"><p>
					<textarea name="questioncontent"
						style="width: 400px; height: 100px;" label="题目"></textarea>
				</p></td>
		</tr>
	</div>
	<div>
		<tr>
			<td width="120" align="center" valign="middle"
				style="width: 120px; color: #6600FF;"><span
				class="STYLE1 STYLE5"><strong>答案</strong></span></td>
			<td width="300">
				<p>
					<s:radio list="#{1:'对',2:'错'}" name="questionanswer" label="题型" />

				</p>
			</td>
			</td>
		</tr>
	</div>
	<div>
		<tr>
			<td width="120" align="center" valign="middle"
				style="width: 120px; color: #6600FF;"><span
				class="STYLE1 STYLE5"><strong>难易程度</strong></span></td>
			<td width="300">

				<p>
					<s:radio list="#{1:'简单',2:'有点难度',3:'相对复杂',4:'困难',5:'很困难',6:'天才级别'}"
						name="questiondifficulty" label="题型" />

				</p>
			</td>
		</tr>
	</div>
	<div>
		<tr>
			<td width="120" align="center" valign="middle"
				style="width: 120px; color: #6600FF;"><span
				class="STYLE1 STYLE5"><strong>问题来源</strong></span></td>
			<td width="300">

				<p>
					<textarea name="questionfrom" rows="10"
						style="width: 400px; height: 100px;" label="题目">请输入题目来源
</textarea>
				</p>
			</td>
		</tr>
	</div>
	<div>

		<div align="center">
			<input type="submit" value="提  交" />
		</div>
	</div>
</body>
</html>
