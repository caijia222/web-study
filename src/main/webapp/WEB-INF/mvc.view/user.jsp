<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.caijia.mvc.model.*"%>
<!DOCTYPE html>
<%
User user = (User) request.getAttribute("user");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World JSP</title>
</head>
<body>
	<h1>Hello <%=user.getName() %> !</h1>
	<p>School Name:
	<span style="color: red;">
		<%=user.getSchool().getName() %>
	</span>
	</p>
	<p>School Address:
	<span style="color: red;">
	<%= user.getSchool().getAddress() %>
	</span>
	</p>
</body>
</html>