<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="boardMgr" class="pack.board.BoardManager" />

<%
// page는 bean에 없음, 추가
String spage = request.getParameter("page");
String num = request.getParameter("num");
String pass = request.getParameter("pass");

// 비밀번호가 같아야 수정 가능(입력한 비번, db저장된 비번)
boolean b = boardMgr.checkPass(Integer.parseInt(num), pass);

if(b){
	boardMgr.delData(num);
	response.sendRedirect("boardlist.jsp?page=" + spage);
}else{
%>
	<script>
	alert("비밀번호 불일치~");
	history.back();
	</script>
<%
}
%>