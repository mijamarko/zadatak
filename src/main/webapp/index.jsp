<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hello</h1>
	<c:if test="${sessionScope.loggedInUser == null}"><c:redirect url="/app/login" /></c:if>
	<c:if test="${sessionScope.loggedInUser != null }"><c:redirect url="/app/home" /></c:if>
</body>
</html>