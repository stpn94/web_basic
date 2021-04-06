<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	Cookie cookie = new Cookie("name", "hongkildong");
	cookie.setMaxAge(600);
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<strong><h2><%= cookie.getName() %></h2>
<h2><%= cookie.getValue() %></h2>
<h2><%= cookie.getMaxAge() %></h2>
<a href="cookieTest2.jsp">쿠키 값 불러오기 링크</a>
</strong>
<hr>

<h2><%= cookie.getComment() %></h2>
<h2><%= cookie.getDomain() %></h2>
<h2><%= cookie.getPath() %></h2>
<h2><%= cookie.getSecure() %></h2>
<h2><%= cookie.getVersion() %></h2>
<h2><%= cookie.getClass() %></h2>
</body>
</html>