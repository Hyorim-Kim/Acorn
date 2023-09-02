<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
EL : jsp 표현식을 대신해 속성 값을 쉽게 출력하기 위한 언어(<%= %>를 대체)
 	 : 출력 및 반복처리를 태그 기반으로 제공
 	 : ${표현식}으로 사용, JSTL과 함께하면 더욱 효과적
 	 : pageScope, requestScope, param, ... 등의 내장객체를 지원
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>환영합니다. EL 세상 방문을 ...</h2>
<%
if(request.getParameter("user") == null){
%>
 	<jsp:forward page="el_1.html" />
<%
}
%>
사용자가 전송한 user명 출력<br/>
1-1) jsp servlet 사용 : <% out.println(request.getParameter("user")); %>
<br/>
1-2) jsp 표현식 사용 : <%= request.getParameter("user") %>
<br/>
1-3) EL 사용 : ${param.user}
</body>
</html>