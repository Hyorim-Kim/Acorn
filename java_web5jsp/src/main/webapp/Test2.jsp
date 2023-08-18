<!-- page 지시어 : 현재 문서의 속성이나 정보 등을 선언 또는 지시하는 역할 -->

<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.ZoneId"%>
<%@ page
language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="java.time.LocalDate"
import="java.sql.*"
session="true"
buffer="8kb"
autoFlush="true"
isThreadSafe="true"
info="jsp문서정보"
errorPage="error.jsp"

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
* 지시어 연습 *</p>
<%
// 날짜 및 시간
LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
int year = now.getYear();
int hour = now.getHour();
out.println(year + "년 어느날 " + hour + "시에 실습을 진행함");
%>
<br>
<%= this.getServletInfo() %>
<hr>
<%= 10 / 2 %>
</body>
</html>