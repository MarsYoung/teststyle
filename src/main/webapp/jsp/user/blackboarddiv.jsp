<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="pg" uri="http://jsptags.com/tags/navigation/pager"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table>
	<c:choose>
		<c:when test="${not empty pager.list }">
			<c:forEach items="${pager.list }" var="item" varStatus="status">
				<tr>
					<td width="79">${item.username}</td>
					<td width="436">${item.info}</td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
	没有记录可显示！
	</c:otherwise>
	</c:choose>
</table>
more

