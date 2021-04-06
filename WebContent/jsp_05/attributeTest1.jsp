<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Attribute Test</title>
</head>
<body>
<h2>영역과 속성 테스트</h2>
<%
request.setCharacterEncoding("UTF-8"); //UTF-8로 맞추고
String name=request.getParameter("name");//파라미터에 있는 name 불러와서 name으로 넣기
String id=request.getParameter("id");//파라미터에 있는 id 불러와서 id로 넣기
if(name!=null&&id!=null){ //만약 name이 널이아니고 id가 널이 아닐때
	application.setAttribute("name",name); //이름 값을 application에 공유
	application.setAttribute("id",id); //이름 값을 application에 공유
}
%>
<h3><%=name %>님 반갑습니다.<br><%=name %>님의 아이디는 <%=id %>입니다.</h3> <%--클라이언트에 전송된 값 출력 --%>
<form action="attributeTest2.jsp" method="post"> <%--세션영역에 저장할 값을 입력받는 form영역을 정의 --%>
<table border="1">
	<tr><td colspan="2">Session 영역에 저장할 내용들</td></tr>
	<tr>
		<td>e-mail 주소</td>
		<td><input type="text" name="email"></td>
	</tr>
	<tr>
		<td>집 주소</td>
		<td><input type="text" name="address"></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type="text" name="tel"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="전송"></td>
	</tr>
</table>
</form>
</body>
</html>
