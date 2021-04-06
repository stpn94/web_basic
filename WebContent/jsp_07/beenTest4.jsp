<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="beentest" class = "web_basic.jsp_07.Student" scope="page"/>
<jsp:setProperty property="*" name="beentest"/>
<html>
<head>
<meta charset="UTF-8">
<title>Javabeen Test</title>
</head>
<body>
<h1>자바빈 속성 값 출력</h1>
<b>번호 : </b> <%=beentest.getStdNo() %><br>
<b>이름 : </b> <%=beentest.getStdName() %><br>
<b>국어 : </b> <%=beentest.getKor() %><br>
<b>영어 : </b> <%=beentest.getEng() %><br>
<b>수학 : </b> <%=beentest.getMath() %><br>
<b>총점 : </b> <%=beentest.getTotal() %><br>
<b>평균 : </b> <%=beentest.getAvg() %><br>
</body>
</html>