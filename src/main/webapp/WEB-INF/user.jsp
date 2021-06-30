<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.caijia.bean.*"%>
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
		<%=user.getSchool().getName() %>
	</p>
</body>
</html>