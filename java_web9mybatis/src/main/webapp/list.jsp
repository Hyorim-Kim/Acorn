<%@page import="pack.business.SangpumDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="sDao" class="pack.business.ServiceDao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>* 상품 자료 *</h3>
<a href="ins.html">상품 추가</a>
<br/>
<%ArrayList<SangpumDto> list = (ArrayList)sDao.selectAll(); %>
<div style="color: red">코드를 클릭하면 삭제, 품명을 클릭하면 수정</div>
<table border="1">
 	<tr><td>코드</td><td>품명</td><td>수량</td><td>단가</td></tr>
 	<c:forEach var="s" items="<%=list %>">
 	<tr>
 	 	<td><a href="delete.jsp?code=${s.code}">${s.code }</a></td>
 	 	<td><a href="update.jsp?code=${s.code}">${s.sang }</a></td>
 	 	<td>${s.su }</td>
 	 	<td>${s.dan }</td>
 	</tr>
 	</c:forEach>
</table>
</body>
</html>