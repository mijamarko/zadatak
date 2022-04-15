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

	<h2>Hello, ${sessionScope.username}</h2>
	 


	<jsp:include page="/WEB-INF/fragments/footer.jsp" flush="true" />
</body>
</html>