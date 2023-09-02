<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- insert 작업용 jsp는 저장이 목적, 저장 후 상품 목록을 출력 (비즈니스 로직을 담당, 출력용 X) --%>
<%
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="bean" class="pack2.sangpumBean" />
<jsp:setProperty property="*" name="bean" />
<%-- 출력하여 확인해보기
<%=bean.getSang() %>   <%=bean.getSu() %>
--%>
<jsp:useBean id="test" class="pack2.Test14connPooling"></jsp:useBean>
<%
boolean b = test.insertData(bean);   // 8 line에 의해 beans 존재, 호출

if(b){
  	// 추가 성공 시 상품 정보 페이지로 이동
  	// 클라이언트를 통해 호출해야 함 : response.sendRedirect
  	response.sendRedirect("Test14sangpum.jsp");
}else{
	// 추가 실패 시 에러페이지로 이동
	response.sendRedirect("Test14error.html");
}
%>


