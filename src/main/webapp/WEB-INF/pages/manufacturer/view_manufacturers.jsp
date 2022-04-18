<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manufacturer list</title>
</head>
<body>
	<header>
		<jsp:include page="/WEB-INF/fragments/header.jsp" flush="true" />
	</header>
	<div class="container">
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>PIB</th>
					<th>PID</th>
					<th>ADDRESS</th>
					<th>CITY</th>
					<th>ACTIONS</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="manufacturer" items="${sessionScope.manufacturers}">
					<tr>
						<td>${manufacturer.id}</td>
						<td>${manufacturer.pib}</td>
						<td>${manufacturer.pid}</td>
						<td>${manufacturer.address}</td>
						<td>${manufacturer.city.name}</td>
						<td><a href="#">View</a><a href="#">Edit</a><a href="#">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>