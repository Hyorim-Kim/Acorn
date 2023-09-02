<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String code = request.getParameter("code"); %>
<jsp:useBean id="test" class="pack2.Test14connPooling" />
<%
if(test.deleteData(code)) // 수행할 문장이 한 문장이라 중괄호 제거
 	response.sendRedirect("Test14sangpum.jsp");  // 삭제 후 상품정보 보기
else
	response.sendRedirect("Test14error.html");
%>
