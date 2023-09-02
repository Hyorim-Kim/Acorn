<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String message = request.getParameter("message");
%>
<jsp:useBean id="my" class="pack.Test10" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
* 클라이언트에서 전달된 메세지 사용 *<br/>

<%
// 지금까지의 기술만 사용
my.setMessage(message);
out.println(my.getMessage());
%>
<br/>
<%-- jsp action tag 사용 --%>
<%-- line 4, 19 == line 25 --%>
<jsp:setProperty property="message" name="my"/>  <%-- 자바의 setMessage == message --%>
<jsp:getProperty property="message" name="my"/>
</body>
</html>