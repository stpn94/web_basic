<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Attribute Test Form</title>
</head>
<body>
<h2>영역과 속성 테스트</h2>
<form action="attributeTest1.jsp" method="post">
<table border="1"><%--Table 생성 --%>
	<tr><td colspan="2">Application 영역에 저장할 내용들</td></tr><%--Table 병합 --%>
	<tr>
		<%--이름 |이종윤--%>
		<td>이름</td>
		<td><input type="text" name="name"></td><%--이름 넣는 text 상자--%>
	</tr>
	<tr>
		<%--아이디 |이종윤--%>
		<td>아이디</td>
		<td><input type="text" name="id"></td><%--id 넣는 text 상자--%>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="전송"></td><%--Table 병합 하고 '전송' 버튼 생성--%>
	</tr>
</table>
</form>
</body>
</html>
