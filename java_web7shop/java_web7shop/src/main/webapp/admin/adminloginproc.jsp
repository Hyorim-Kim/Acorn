<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="memberMgr" class="pack.member.MemberManager" />
<%
request.setCharacterEncoding("utf-8");
String adminid = request.getParameter("adminid");
String adminpwd = request.getParameter("adminpwd");

boolean b = memberMgr.adminLoginCheck(adminid, adminpwd);

if(b){
	session.setAttribute("adminKey", adminid);  // 관리자 "adminKey"라는 이름의 세션을 생성
	response.sendRedirect("admin_index.jsp");
}else{
%>
 	<script>
 	 	alert("관리자 로그인 입력자료 불일치!");
 	 	location.href="adminlogin.jsp";
 	</script>
<%	
}
%>

