<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더 정보 예제</title>
<style type="text/css">
h1 {
	text-align: center;
}

table {
	margin: auto;
	width: 800px;
	border: 1px solid red;
}

</style>
</head>
<body>
	<h1>헤더 정보 예제</h1>
	<table>
		<tr>
			<th>헤더이름</th>
			<td>헤더값</td>
		</tr>
		<%
			Enumeration<String> e = request.getHeaderNames();
		while (e.hasMoreElements()) {
			String headerName = e.nextElement();
		%>
		<tr>
			<td><%=headerName%></td>
			<td><%=request.getHeader(headerName)%></td>
		</tr>

		<%
			}
		%>

	</table>

</body>
</html>