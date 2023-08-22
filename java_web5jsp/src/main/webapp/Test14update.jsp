<%@page import="pack2.sangpumDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String code = request.getParameter("code"); // code 읽기 %>
<jsp:useBean id="test" class="pack2.Test14connPooling" />
<%
// html에 뿌려야함 <!DOCTYPE html> 필요
sangpumDto dto = test.getData(code);
if(dto == null){
	// 없는 자료를 호출할 때 (수정 불가)
%>
 	<script>
 	 	alert("등록된 코드번호가 아닙니다.\n수정 불가 ~");
 	 	location.href = "Test14sangpum.jsp";
 	</script>
<%
 	return;  // 서비스 메소드를 빠져나감
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
** 상품 수정 **<br/>
<form action="Test14updateok.jsp" method="post">
 	<input type="hidden" name="code" value="<%=dto.getCode() %>"><br/>
 	코드 : <%=dto.getCode() %><br/>  <%-- pk는 수정대상 아님 --%>
 	품명 : <input type="text" name="sang" value="<%=dto.getSang() %>"><br/>
 	수량 : <input type="text" name="su" value="<%=dto.getSu() %>"><br/>
 	단가 : <input type="text" name="dan" value="<%=dto.getDan() %>"><br/>
 	<br/>
 	<input type="submit" value="자료 수정" />
 	<input type="button" value="수정 취소" onclick="javascript:location.href='Test14sangpum.jsp'" />
</form>
</body>
</html>