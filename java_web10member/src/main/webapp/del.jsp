<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="process" class="pack.business.ProcessImpl" /> 
    
<%
String id = request.getParameter("id");
boolean b = process.deleteData(id);

if(b)
	response.sendRedirect("list.jsp");
else
	response.sendRedirect("fail.jsp");
%>