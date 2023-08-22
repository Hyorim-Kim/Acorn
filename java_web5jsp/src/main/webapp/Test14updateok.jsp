<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="bean" class="pack2.sangpumBean" /> <%-- bean은 객체변수 --%>
<jsp:setProperty property="*" name="bean" /> <%-- form bean 처리 --%>
<jsp:useBean id="test" class="pack2.Test14connPooling" /> <%-- Test14connPooling가 비즈니스 로직 갖고있음 --%>

<%
if(test.updateData(bean)) // 수행할 문장이 한 문장이라 중괄호 제거
 	response.sendRedirect("Test14sangpum.jsp");
else
	response.sendRedirect("Test14error.html");
%>
