<%@page import="org.studyeasy.Model.Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/files/css/style.css">

<meta charset="UTF-8">
<title>homepage</title>
</head>
<body>
	<h1>Hello this side...</h1>
	<br />
	<hr>
	<table border="1">
		<thead>
			<th>UserID</th>
			<th>User Name</th>
			<th>Email</th>
		</thead>
		
	

	<% List<Model> list = (List) request.getAttribute("list"); %>
		
			<c:forEach var="temp" items="${list}">
	
				<tr>
					<td><c:out value="${temp.userId}"/>
					</td>
					<td><c:out value="${temp.name}"/>
					</td>
					<td><c:out value="${temp.email}"/>
					</td>
				</tr>

		</c:forEach>
		
		
	</table>
</body>
</html>