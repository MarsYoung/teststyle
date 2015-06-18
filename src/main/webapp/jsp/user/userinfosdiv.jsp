<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="pg" uri="http://jsptags.com/tags/navigation/pager"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${not empty pager.list }">
		<c:forEach items="${pager.list }" var="item" varStatus="status">
			<div id="userinfo">
				<div id="friendssharing">
					<div id="friendpic"></div>
					<div id="friendname">用户名：${item.username}</div>
					<div id="friendsharing">消息：${item.info}</div>
					<div id="time">时间：${item.createtime}</div>
				</div>
			</div>
		</c:forEach>
	</c:when>
	<c:otherwise>
	没有记录可显示！
	</c:otherwise>
</c:choose>
<pg:pager items="${pager.maxElements }" url="${pager.url }"
	maxIndexPages="${pager.maxIndexPages }"
	maxPageItems="${pager.pageSize }">
	<pg:index>
		<pg:first>
			<a href="javascript:void(0)"
				onclick="changeUserInfoPage('${pageUrl }')" style="color: green">首页</a>
		</pg:first>
		<pg:prev>
			<a href="javascript:void(0)"
				onclick="changeUserInfoPage('${pageUrl }' )" style="color: green">上一页</a>
		</pg:prev>
		<pg:pages>
			<c:choose>
				<c:when test="${pager.pageNumber eq pageNumber}">
					<a href="javascript:void(0)"
						onclick="changeUserInfoPage('${pageUrl }')" style="color: white">${pageNumber
						}</a>
				</c:when>
				<c:otherwise>
					<a href="javascript:void(0)"
						onclick="changeUserInfoPage('${pageUrl }')" style="color: green">${pageNumber
						}</a>
				</c:otherwise>
			</c:choose>
		</pg:pages>
		<pg:next>
			<a href="javascript:void(0)"
				onclick="changeUserInfoPage('${pageUrl }')" style="color: green">下一页</a>
		</pg:next>
		<pg:last>
			<a href="javascript:void(0)"
				onclick="changeUserInfoPage('${pageUrl }')" style="color: green">末页</a>
		</pg:last>
	</pg:index>
</pg:pager>
共${pager.total }页 ${pager.maxElements }条
