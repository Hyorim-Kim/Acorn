<%@page import="pack.bangDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="bangdb" class="pack.connPooling" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
* 방명록 보기 *
<hr/>
<a href="insert.html">글쓰기</a>&nbsp;
<br/><br/>
<table border="1">
 	<tr><th>코드</th><th>작성자</th><th>제목</th><th>내용</th></tr>
 	<% 
 	ArrayList<bangDto> list = bangdb.getDataAll();
 	for(bangDto b:list){
  	%>
  	<tr>
  	 	<td><%=b.getCode() %></td>
  	 	<td><%=b.getName() %></td>
  	 	<td><%=b.getSubject() %></td>
  	 	<td><%=b.getContents() %></td>
  	</tr>
  	<%
 	}
 	%>
</table>
</body>
</html>