<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ page trimDirectiveWhitespaces="true"%>

<%--需要使用服务器端的注释，否则在UserTrackAction中msg将包含注释部分，即注释+false,不可能判为false --%>
<%--resp 在BaseAction里面定义 --%>
${resp }