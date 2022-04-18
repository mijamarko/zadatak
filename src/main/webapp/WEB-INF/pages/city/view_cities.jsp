<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>City list</title>
</head>
<body>
	<header>
		<jsp:include page="/WEB-INF/fragments/header.jsp" flush="true" />
	</header>
	<div class="container">
		<table>
			<thead>
				<tr>
					<th>Zip Code</th>
					<th>Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="city" items="${sessionScope.cities}">
					<tr>
						<td>${city.zipCode}</td>
						<td>${city.name}</td>
						<td><a href="#">View</a><a href="#">Edit</a><a href="#">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>