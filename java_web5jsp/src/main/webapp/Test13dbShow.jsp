<%@page import="pack.Test13jikwon"%>
<%@page import="pack.Test13dto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="test13jikwon" class="pack.Test13jikwon" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String buser = (String)request.getParameter("buser");
%>
<h2>* 직원 자료 *</h2>
<table border="1">
 	<tr><th>사번</th><th>이름</th><th>직급</th><th>성별</th></tr>
<% 
ArrayList<Test13dto> list = test13jikwon.getDataAll(buser);
for(Test13dto d:list){
%>
 	<tr>
 	 	<td><%=d.getJikwon_no()%></td>
 	 	<td><%=d.getJikwon_name()%></td>
 	 	<td><%=d.getJikwon_jik()%></td>
 	 	<td><%=d.getJikwon_gen()%></td>
 	</tr>
<%
}
%>
</table>
건수 : <%=list.size() %>
</body>
</html>