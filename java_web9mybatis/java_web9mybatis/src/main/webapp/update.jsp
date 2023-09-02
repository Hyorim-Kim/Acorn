<%@page import="pack.business.SangpumDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="sDao" class="pack.business.ServiceDao" />
<%
String code= request.getParameter("code");
SangpumDto dto = sDao.selectData(code);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
** 상품 수정 **<br/>
<form action="updateok.jsp" method="post">
코드 : <input type="hidden" name="code" value="<%=dto.getCode() %>"/>
 	  <%=dto.getCode() %><br/>
품명 : <input type="text" name="sang" value="<%=dto.getSang() %>" /><br/>
수량 : <input type="text" name="su" value="<%=dto.getSu() %>" /><br/>
단가 : <input type="text" name="dan" value="<%=dto.getDan() %>" /><br/>
<br/>
<input type="submit" value="수정" />
</form>
</body>
</html>