<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="bean" class="pack.board.BoardBean" />
<jsp:setProperty property="*" name="bean" />
<jsp:useBean id="boardMgr" class="pack.board.BoardManager" />

<%
// page는 bean에 없음, 추가
String spage = request.getParameter("page");

// 비밀번호가 같아야 수정 가능(입력한 비번, db저장된 비번)
boolean b = boardMgr.checkPass(bean.getNum(), bean.getPass());

if(b){
	//out.print("맞네");
	boardMgr.updateData(bean);
	response.sendRedirect("boardlist.jsp?page=" + spage);
}else{
	//out.print("아니네");
%>
	<script>
	alert("비밀번호 불일치~");
	history.back();
	</script>
<%
}
%>