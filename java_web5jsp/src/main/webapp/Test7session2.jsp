<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>선택한 영화 출력</h2>
<%
request.setCharacterEncoding("utf-8");
String movie = request.getParameter("movie");
String id = (String)session.getAttribute("idKey");

if(id != null){
%>
 	<%=id %>를 가진 분이 선택한 영화는 <%=movie %><br/>
 	세션 고유 아이디 : <%=session.getId() %><br/>
 	세션 유지 시간 : <%=session.getMaxInactiveInterval() %><br/>
<%
 	//session.invalidate();   // 세션 내의 모든 키 삭제
 	//session.removeAttribute("key값");  // 특정 키만 삭제
} else{
 	out.println("허걱 세션이 없어요");
}
%>
</body>
</html>