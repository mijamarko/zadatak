<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="header">
  <c:if test="${sessionScope.loggedIn == true}">
  	<jsp:include page="/WEB-INF/fragments/navigation.jsp"/>
  </c:if>
</div>