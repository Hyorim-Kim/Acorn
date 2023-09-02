<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="bean" class="pack.bangBean" />
<jsp:setProperty property="*" name="bean" />
<jsp:useBean id="bangdb" class="pack.connPooling" /> 
<%
boolean b = bangdb.insertData(bean);

if(b){
  	// 추가 성공 시 상품 정보 페이지로 이동
  	// 클라이언트를 통해 호출해야 함 : response.sendRedirect
  	response.sendRedirect("show.jsp");
}else{
	response.sendRedirect("error.jsp");
}
%>