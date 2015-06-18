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
-->
</style>
</head>

<body>

	<div id="container">
		<div id="header">
			<div id="logo"></div>
			<div></div>
		</div>
		<div id="middle">
			<form action="/teststyle/question/update.action" method="post">
				<s:hidden name="id"></s:hidden>
				<s:hidden name="questiontype"></s:hidden>
				<s:hidden name="questionsubject"></s:hidden>
				<s:hidden name="datetime"></s:hidden>
				<div
					style="height: auto; width: 700px; margin-right: auto; margin-left: auto; background-color: #D3EBF7;">

					<div>
						<tr>
							<td width="120" align="center" valign="middle"
								style="width: 120px; color: #6600FF;"><span
								class="STYLE5 STYLE1"><strong>题目</strong></span></td>
							<td width="300"><p>
									<textarea name="questioncontent" rows="10"
										style="width: 400px; height: 100px;" label="题目">${questioncontent}
</textarea>
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
									<textarea name="questionanswer" id="answer"
										style="width: 400px; height: 100px;">${questionanswer}
                        </textarea>
								</p>
								<p>&nbsp;</p>
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
									<s:radio
										list="#{1:'简单',2:'有点难度',3:'相对复杂',4:'困难',5:'很困难',6:'天才级别'}"
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
										style="width: 400px; height: 100px;" label="题目">${questionfrom}
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
				</div>
			</form>
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
