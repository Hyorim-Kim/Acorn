<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>EL 연산자, 내장 객체</h2>
--- 연산자 연습 ---<br/>
\${3 + 4} ==> ${3 + 4}<br/>
\${5 / 4} ==> ${5 / 4} <%-- ${5 div 4} --%><br/>
\${5 / 0} ==> ${5 / 0} <%-- ${5 div 0} --%><br/>
\${5 % 4} ==> ${5 % 4} ${5 mod 4}<br/>

\${3 > 4} ==> ${3 > 4} ${3 gt 4}<br/>
\${3 >= 4} ==> ${3 >= 4} ${3 ge 4}<br/>

\${5 >= 4 and 3 < 2} ==> ${5 >= 4 and 3 < 2} ${5 ge 4 and 3 lt 2}<br/>

\${5 >= 4?10:10+10} ==> ${5 >= 4?10:10+10}<br/>

<hr/>
--- EL 내장 객체 연습 ---<br/>
<%
request.setAttribute("aa", "잠깸");
session.setAttribute("bb", "예진 졸음");
application.setAttribute("cc", "졸음 곧 예진");
%>
* 생존범위 관련 작업 *<br/>
jsp : <%=request.getAttribute("aa") %>  EL: ${requestScope.aa}, ${aa }<br/>
jsp : <%=session.getAttribute("bb") %>  EL: ${sessionScope.bb}<br/>
jsp : <%=application.getAttribute("cc") %>  EL: ${applicationScope.cc}<br/>
<br/>
jsp의 header : <%=request.getHeader("host") %><br/>
EL로 표현 : ${header.host } ${header["host"] }

* 컬렉션 객체 값 처리 *<br/>
<%
ArrayList<String> list = new ArrayList();
list.add("불고기 피자");
list.add("슈림프 피자");
request.setAttribute("list", list);

ArrayList<String> list2 = new ArrayList();
list2 = (ArrayList)request.getAttribute("list");
out.println("jsp로 표현 : " + list2.get(0));
out.println("jsp로 표현 : " + list2.get(1));
%>
<br/>
EL로 표현 : ${requestScope.list[0]} ${list["1"]}
<hr>
--- html 문서 자료 받기 ---<br/>
<a href="el_2.html">el_2문서 호출</a><br/>
이름은 ${param.irum } ${param["irum"] }<br/>
성격은 ${paramValues.sung[0] } ${paramValues.sung["1"] }<br/>
</body>
</html>