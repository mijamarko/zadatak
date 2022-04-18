<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit ${sessionScope.city.name}</title>
</head>
<body>
	<header>
		<jsp:include page="/WEB-INF/fragments/header.jsp" flush="true" />
	</header>
	<div class="container">
		<form action="">
			<label>Zip code <input type="text" name="zipCode" value="${sessionScope.city.zipCode}" readonly="readonly"></label>
			<label>Name <input type="text" name="name" value="${sessionScope.city.name}"></label>
			<input type="submit" value="edit" name="edit"/>
			<input type="submit" value="cancel" name="cancel"/>
		</form>
		
	</div>

</body>
</html>