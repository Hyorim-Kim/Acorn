<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>jsp(html + java) 연습</h2>
<%
// scriptlet : 이 영역에서는 자바 코드를 자유롭게 기술
String irum = "홍길동";

// 내장 객체 out을 이용해 java를 client browser에 출력
out.println(irum + "의 홈페이지입니다");

for(int i=1; i<7; i++){
	out.print("<h" + i + ">");
	out.print("h태그 출력");
	out.println("</h" + i + ">");
}
%>
<hr>
<%
// 자바 주석
int kor = 90;
out.println("kor : " + kor);
out.println(new java.util.Date());
%>
<br>
<%= "kor : " + kor %>    <%-- jsp 주석 --%>
<%= new java.util.Date() %>    <!-- expression 표현식 -->
<br>
<%
int a = 0, sum = 0;
do{
	a++;
	sum += a;
}while(a < 10);
%>
<%= "10까지의 합은 " + sum %>
<br>
<%= irum + "님의 전화번호는 " + tel %> 	 <!-- service 메소드 내의 지역변수 -->
<%! String tel = "02-111-1111"; %>   <!-- 선언문(declaration)을 사용해서 클래스의 멤버필드(전역변수) -->
<br>
<%!
// 선언문을 사용해서 클래스의 멤버 메소드
public int add(int su1, int su2){
	return su1 + su2;
}
%>
<%= add(10, 20) %>
</body>
</html>
