<%@page import="java.time.ZoneId"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<hr>
이 곳은 문서의 바닥글 용도로 작성함    
<%
// 날짜 및 시간
LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
int year = now.getYear();
int hour = now.getHour();
out.println(year + "년 어느날 " + hour + "시에 실습을 진행함");
%>