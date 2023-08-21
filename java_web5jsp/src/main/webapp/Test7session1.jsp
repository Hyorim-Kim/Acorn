<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
session.setAttribute("idKey", id);   // 세션이 살아있는동안
session.setMaxInactiveInterval(10);  // id값은 10초 간 살아있음

//request.setAttribute("idKey", id);   // 현재 페이지에서만
//application.setAttribute("idKey", id);   // 서비스가 살아있는동안 유효(모든 사용자에게 public)

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>세션 연습 중</h2>
** 감명 깊은 영화는? **
<form action="Test7session2.jsp">
<input type="radio" name="movie" value="오펜하이머" checked="checked">오펜하이머
<input type="radio" name="movie" value="밀수">밀수
<input type="radio" name="movie" value="베트맨">베트맨
<p/>
<input type="submit" value="결과 확인">
</form>
</body>
</html>