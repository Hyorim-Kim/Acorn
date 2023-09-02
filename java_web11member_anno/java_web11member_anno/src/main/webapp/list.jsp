<%@page import="pack.business.DataDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="func" uri="http://java.sun.com/jsp/jstl/functions" %>

<jsp:useBean id="process" class="pack.business.ProcessImpl" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>* 회원 정보(MyBatis-annotation 사용) *</h2>
<a href="ins.jsp">회원 추가</a>
<table border="1">
 	<tr><th>id</th><th>이름</th><th>비번</th><th>등록일</th></tr>
 	<%ArrayList<DataDto> list = (ArrayList)process.selectDataAll(); %>
 	<c:set var="list" value="<%=list %>" />
 	<c:if test="${empty list }">
 	<tr><td colspan="4">회원자료 없음</td></tr>
 	</c:if>
 	
 	<c:forEach var="m" items="<%=list %>">
 	<tr>
 	 	<td><a href="del.jsp?id=${m.id}">${m.id }</a></td>
 	 	<td><a href="up.jsp?id=${m.id}">${m.name }</a></td>
 	 	<td>${m.passwd }</td>
 	 	<td>${func:substring(m.reg_date, 0, 10)}</td>
 	</tr>
 	</c:forEach>
</table>
id 클릭은 삭제, name 클릭은 수정
</body>
</html>