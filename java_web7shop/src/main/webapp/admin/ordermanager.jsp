<%@page import="pack.product.ProductDto"%>
<%@page import="pack.order.OrderBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 관리자가 고객이 구매신청한 상품 목록을 보기 --%>
<jsp:useBean id="orderMgr" class="pack.order.OrderManager" />
<jsp:useBean id="productMgr" class="pack.product.ProductManager" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문관리</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../js/script.js"></script>
</head>
<body>
* 주문된 상품 정보  *
<%@include file="admin_top.jsp" %>
<br/>
<table style="width: 90%">
 	<tr>
 	 	<th>주문번호</th><th>고객id</th><th>상품명</th><th>주문 수</th><th>주문일자</th><th>주문상태</th><th>보기</th>
 	</tr>
 	<%
 	ArrayList<OrderBean> list = orderMgr.getOrderAll();
 	if(list.size() == 0){
 	%>
 	<tr><td colspan="7">주문내역이 없습니다</td></tr>
 	<%
 	}else{
 		for(int i=0; i < list.size(); i++){
 			OrderBean order = list.get(i);  // <OrderBean>타입이기 때문에 캐스팅 필요없음
 			ProductDto product = productMgr.getProduct(order.getProduct_no());  // 고객id 읽기
 	%>
 	<tr style="text-align: center">
 	 	<td><%=order.getNo() %></td>
 	 	<td><%=order.getId() %></td>
 	 	<td><%=product.getName() %></td>
 	 	<td><%=order.getQuantity() %></td>
 	 	<td><%=order.getSdate() %></td>
 	 	<td>
 		 	<%
 	 	 	 	switch(order.getState()){
 	 	 	 	case "1":out.println("접수");break;
 	 	    	case "2":out.println("입금확인");break;
 	 	 	 	case "3":out.println("배송준비");break;
 	 	 	 	case "4":out.println("배송중");break;
 	 	  		case "5":out.println("처리완료");break;
 	 	  		default:out.println("접수중");
 	 	 	 	}
 	 	 	%>
 	 	</td>
 	 	<td>
 	 	 	<a href="javascript:orderDetail('<%=order.getNo() %>')">상세보기</a>
 	 	</td>
 	</tr>
 	<%
 		}
 	}
 	%>
</table>
<%@include file="admin_bottom.jsp" %>

<form action="orderdetail.jsp" name="detailFrm" method="post">
 	<input type="hidden" name="no" />
</form>
</body>
</html>

