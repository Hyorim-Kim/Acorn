<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>서블릿에 의해 호출된 jsp 파일입니다</h2>
<%
request.setCharacterEncoding("UTF-8");

//redirect 방식으로 전송한 자료를 수신 (단일값만 넘길 수 있고 컬렉션 형태로는 전달X)
//String data = request.getParameter("data");
//out.println("자료는 " + data);

//forward 방식으로 전송한 자료를 수신
String data = (String)request.getAttribute("mydata");  // String을 담기 위해 캐스팅함
out.println("자료는 " + data);
%>
</body>
</html>