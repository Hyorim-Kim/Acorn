<%@page import="pack.Test9gugudan"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
구구단 출력<hr/>
* 방법1 : 현재 실력으로 출력 *<br/>
<%
// 클라이언트 요청 시 객체가 매번 만들어지기 때문에 메모리 차지 큼
int dan = Integer.parseInt(request.getParameter("dan"));
out.println(dan + "단 출력<br/>");
Test9gugudan gugudan = new Test9gugudan();  // 클래스의 포함관계, 싱글톤 처리를 해야함.
int re[] = gugudan.processGugu(dan);
for(int a = 0; a < 9; a++){
	out.println(dan + "*" + (a + 1) + "=" + re[a] + "&nbsp;&nbsp;");
}
%>
<br/><br/>
* 방법2 : beans를 사용 *<br/>
<%-- 아래 소스는 Test9gugudan gugudan = new Test9gugudan() + 싱글톤 처리라고 볼 수 있다 --%>
<jsp:useBean id="gugu" class="pack.Test9gugudan" scope="page"></jsp:useBean>
<%
int re2[] = gugudan.processGugu(dan);
for(int a = 0; a < 9; a++){
	out.println(dan + "*" + (a + 1) + "=" + re2[a] + "&nbsp;&nbsp;");
}
%>
</body>
</html>