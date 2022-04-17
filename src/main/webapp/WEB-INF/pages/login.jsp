<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
</head>
<body>
	<header>
		<jsp:include page="/WEB-INF/fragments/header.jsp" flush="true" />
	</header>
	<div>
		<form action="/zadatak/app/login" method="POST">
			<label>Username<input type="text" id="username"
				name="username" /></label> <label>Password<input type="password"
				id="password" name="password" /></label> <input type="submit" value="Log In" />
			<c:if test="${login_failed == true}">
		${error_message}
	</c:if>
		</form>
	</div>

</body>
</html>