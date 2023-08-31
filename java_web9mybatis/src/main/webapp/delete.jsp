<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="sDao" class="pack.business.ServiceDao" />
<%
boolean b = sDao.delData(Integer.parseInt(request.getParameter("code")));

if(b){
	response.sendRedirect("list.jsp");
}else{
%>
 	<script>
 	 	alert("삭제 실패");
 	 	location.href="list.jsp";
 	</script>
<%
}
%>