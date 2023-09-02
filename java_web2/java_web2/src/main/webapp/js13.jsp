<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("id");
// id 값이 123이 아니면 입력화면으로 들어감
if(!id.equals("1234")) response.sendRedirect("js13re.html");

String irum = request.getParameter("name");
String age = request.getParameter("age");

System.out.println(irum + " " + age);  // 자바로 표준출력장치에 출력
%>
서버로 전송된 데이터를 다시 클라이언트 출력<br>
이름은 <%=irum %> 나이는 <%=age %>
</body>
</html>