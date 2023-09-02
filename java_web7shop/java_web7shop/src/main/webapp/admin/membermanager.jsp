<%@page import="pack.member.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="memberMgr" class="pack.member.MemberManager" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자_회원관리</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../js/script.js"></script>
</head>
<body>
** 관리자 - 전체 회원관리 **<br/>
<div style="text-align: center;">
<%@include file="admin_top.jsp" %>
<br/>
<table style="width: 90%">
 	<tr style="background-color: silver">
 	 	<th>아이디</th><th>회원명</th><th>이메일</th><th>전화</th><th>수정</th>
 	</tr>
 	<%
 	ArrayList<MemberDto> mlist = memberMgr.getMemberAll();
 	for(MemberDto m:mlist){
 	%>
 	<tr>
 	 	<td><%=m.getId() %></td>
 	 	<td><%=m.getName() %></td>
 	 	<td><%=m.getEmail() %></td>
 	 	<td><%=m.getPhone() %></td>
 	 	<td>
 	 	 	<a href="javascript:memUpdate('<%=m.getId()%>')">수정</a></td>
 	</tr>
 	<%	
 	}
 	%>
</table>
<%@include file="admin_bottom.jsp" %>
</div>

<form action="memberupdate_admin.jsp" name="updateFrm" method="post">
 	<input type="hidden" name="id">
</form>
</body>
</html>