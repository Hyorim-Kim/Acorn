<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="orderMgr" class="pack.order.OrderManager" />
<%
String flag = request.getParameter("flag");
String no = request.getParameter("no");
String state = request.getParameter("state");
out.print(flag + " " + no + " " + state);

boolean b = false;

if(flag.equals("update")){
	b = orderMgr.updateOrder(no, state);
}else if(flag.equals("delete")){
	b = orderMgr.deleteOrder(no);
}else{
	response.sendRedirect("ordermanager.jsp");
}

if(b){
%>
 	<script>
 	alert("정상처리됨");
 	location.href = "ordermanager.jsp";
 	</script>
<%}else{%>
 	alert("오류 발생\n관리자에게 문의하세요");
 	location.href = "ordermanager.jsp";
<%
}
%>
