<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section id="formArea">
		<h1>propery="*" 테스트</h1>
		<form action="beenTest4.jsp" method="get">
			<fieldset>
				<label for="stdNo">학번 : ></label> <input type="text" name="stdNo" id="stdNo" /><br>
				<label for="stdName">이름 : ></label> <input type="text" name="stdName" id="stdName" /><br>
				<label for="kor">국어 : ></label> <input type="text" name="kor" id="kor" /><br>
				<label for="eng">영어 : ></label> <input type="text" name="eng" id="eng" /><br>
				<label for="math">수학 : ></label> <input type="text" name="math" id="math" /><br>
				<input type = "submit" value="전송">
			</fieldset>
		</form>
	</section>
</body>
</html>