<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="mBean" class="pack.member.MemberBean" />
<jsp:setProperty property="*" name="mBean" />
<jsp:useBean id="memberMgr" class="pack.member.MemberManager" />

<%
boolean b = memberMgr.memberInsert(mBean);

if(b){
	//out.println("회원가입을 축하합니다");
	response.sendRedirect("../guest/guest/guest_index.jsp");
}else{
	//out.println("ㅠㅠ 회원가입 실패");
	response.sendRedirect("insertfail.html");
}
%>