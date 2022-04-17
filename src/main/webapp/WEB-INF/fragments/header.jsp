<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="header">
	<img alt="" src="">
	<p>header</p>
	<div class="navigation">
		<c:if test="${sessionScope.loggedInUser != null}">
			<span>Hello, ${sessionScope.loggedInUser.username}</span>
			<ul>
				<jsp:include page="/WEB-INF/fragments/navigation.jsp" flush="true" />
			</ul>
		</c:if>
	</div>

</div>