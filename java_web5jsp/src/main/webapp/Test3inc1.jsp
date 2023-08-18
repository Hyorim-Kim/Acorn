<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
홀수 출력 :
<%
for(int a=1; a<=10; a++){
	if(a % 2 == 1) out.print(a + " ");
}
%>
</body>
</html>