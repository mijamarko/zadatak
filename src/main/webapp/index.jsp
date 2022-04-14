<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcome!</title>
</head>
<body>

	 <jsp:include page="/WEB-INF/fragments/header.jsp" flush="true" /> 


	 <c:choose>
		<c:when test="${(sessionScope.loggedIn == null) || (sessionScope.loggedIn == false)}">
			<form action="/app/login">
				<label>Username<input type="text" name="username"></label>
				<label>Password<input type="password" name="password"></label>
				<input type="submit" value="Log In">
			</form>
		</c:when>
		<c:otherwise>
			<c:redirect url="/WEB-INF/home.jsp" />
		</c:otherwise>
	</c:choose>


	<jsp:include page="/WEB-INF/fragments/footer.jsp" flush="true" />
</body>
</html>
