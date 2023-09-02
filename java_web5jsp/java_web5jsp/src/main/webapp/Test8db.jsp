<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 접근지정자는 클래스의 멤버필드에만 사용이 가능(현재는 메소드의 지역변수임), <%! 사용하면 가능
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
try {
	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test", "root", "seoho123");
} catch (Exception e) {
	System.out.println("연결 실패 : " + e);
	return;
}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>** sangdata 출력(beans 사용 안함) **</h2>
<table border="1">
 	<tr><th>코드</th><th>품명</th><th>수량</th><th>단가</th></tr>
<%
try {
	pstmt = conn.prepareStatement("select * from sangdata");
	rs = pstmt.executeQuery();
	while(rs.next()){
%>
	<tr>
	 	<td><%=rs.getString("code") %></td>
	 	<td><%=rs.getString("sang") %></td>
	 	<td><%=rs.getString("su") %></td>
	 	<td><%=rs.getString("dan") %></td>
	</tr>
<%
	}
} catch (Exception e) {
	System.out.println("처리 실패 : " + e);
} finally{
	if(rs != null) rs.close();
	if(rs != null) pstmt.close();
	if(rs != null) conn.close();
}
%>
</table>
</body>
</html>