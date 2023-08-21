<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
//String name = request.getParameter("name");   // 이딴거 계속 줘, 스트레스 팍팍
// ...
%>
<jsp:useBean id="bean" class="pack.Test11formBean" />
<%-- 
<jsp:setProperty property="name" name="bean" />
...
--%>
<jsp:setProperty property="*" name="bean" />
<%
//out.println(bean.getName() + " " + bean.getKor() + " " + bean.getEng());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
폼빈에 등록된 자료를 출력<br/>
이름은 <jsp:getProperty property="name" name="bean"/><br/>
국어는 <jsp:getProperty property="kor" name="bean"/><br/>
영어는 <jsp:getProperty property="eng" name="bean"/><br/>

<jsp:useBean id="process" class="pack.Test11process" />
<jsp:setProperty property="formBean" name="process" value="<%=bean %>"/>
총점은 <jsp:getProperty property="tot" name="process"/><br/>
평균은 <jsp:getProperty property="avg" name="process"/><br/>
</body>
</html>