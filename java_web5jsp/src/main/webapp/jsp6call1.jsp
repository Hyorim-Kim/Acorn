<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String data = request.getParameter("data");

// jsp의 근본은 출력용
// Business Logic이 있는 상태로 뭔가를 처리했다고 가정
String msg = "Mr. " + data;

//1. redirect
//response.sendRedirect("jsp6call2.jsp?data=" + msg);

// 2. forward
request.setAttribute("data", msg);

// forwarding만 가능한 데이터
ArrayList<String> list = new ArrayList<String>();
list.add("준수");
list.add("준호");
list.add("준");
request.setAttribute("friend", list);

//RequestDispatcher dispatcher = request.getRequestDispatcher("jsp6call2.jsp");
//dispatcher.forward(request, response);
%>
<jsp:forward page="WEB-INF/jsp6call2.jsp"></jsp:forward>