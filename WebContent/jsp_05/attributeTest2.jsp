<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Attribute Test</title>
</head>
<body>
<h2>영역과 속성 테스트</h2>
<%
request.setCharacterEncoding("UTF-8"); //인코딩
String email=request.getParameter("email"); //이메일 입력
String address=request.getParameter("address"); // 주소 입력
String tel=request.getParameter("tel");//전번 입력

session.setAttribute("email",email);//email 에트리뷰트에 있는 이메일값 세션에 저장
session.setAttribute("address",address);//address 에트리뷰트에 있는 주소값 세션에 저장
session.setAttribute("tel", tel);//tel 에트리뷰트에 있는 전화번호 세션에 저장

String name=(String)application.getAttribute("name");//이름 에트리뷰트에 있는 거 가져와서 String으로 형변환

%>
<h3><%=name %>님의 정보가 모두 저장되었습니다.</h3>
<a href="attributeTest3.jsp">확인하러 가기</a>
</body>
</html>
