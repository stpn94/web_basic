<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<hr>
	<c:if test="true"/>
무조건 수행<br>

param.name=${param.name }<br>
param.age=${param.age }

<c:if test="${param.name == 'ksk'}">
	name 파라미터의 값이 ${param.name } 입니다.<br>
</c:if>
<c:if test="${param.name eq 'ksk'}">
	name 파라미터의 값이 ${param.name } 입니다.<br>
</c:if>
<c:if test="${18 < param.age }">
	age 파라미터의 값이 ${param.age } 입니다.
</c:if>
</body>
</html>