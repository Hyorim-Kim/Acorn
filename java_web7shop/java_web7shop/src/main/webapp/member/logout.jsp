<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
session.removeAttribute("idKey");
//session.invalidate();
%>
<script>
alert("로그아웃 성공");
location.href="../guest/guest_index.jsp";
</script>

