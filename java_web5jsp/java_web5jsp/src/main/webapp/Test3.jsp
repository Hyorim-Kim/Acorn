<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>include directive 연습</h2>
<%@include file="Test3Top.jsp" %> <!-- 해당 소스가 이 영역으로 호출 -->
여러 페이지에 공통적으로 등장하는 문서 내용은 별도의 파일로 작성 후 호출
<pre>
.
.
.
</pre>

<!-- include action tag : 해당 파일의 실행 결과가 호출 -->
<div style="font-size: 40px">
<jsp:include page="Test3inc1.jsp"></jsp:include>
<br>
<jsp:include page="Test3inc2.jsp">
 	<jsp:param value="korea" name="msg"/>
</jsp:include>
</div>

<%@include file="Test3Bottom.jsp" %>
</body>
</html>