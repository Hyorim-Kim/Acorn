<%@page import="pack.Test12sangpumDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="test12conn" class="pack.Test12conn" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>* 상품 자료 *</h2>
<table border="1">
 	<tr><th>코드</th><th>품명</th><th>수량</th><th>단가</th></tr>
<% 
ArrayList<Test12sangpumDto> list = test12conn.getDataAll();
for(Test12sangpumDto s:list){
%>
 	<tr>
 	 	<td><%=s.getCode() %></td>
 	 	<td><%=s.getSang() %></td>
 	 	<td><%=s.getSu() %></td>
 	 	<td><%=s.getDan() %></td>
 	</tr>
<%
}
%>
</table>
건수 : <%=list.size() %>
</body>
</html>