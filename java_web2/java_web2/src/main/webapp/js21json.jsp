
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
{"sangpum":
[
<%
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
String result = "";

try {
   Class.forName("org.mariadb.jdbc.Driver");
} catch (Exception e) { 
   System.out.println("로딩 실패 : " + e);
   return;
}

try {
   conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test","root","seoho123");
   pstmt = conn.prepareStatement("select * from sangdata");
   rs = pstmt.executeQuery();
   while(rs.next()){  //{"code":"100","sang":"glove"},
    	result += "{";
    	result += "\"code\":" + "\"" + rs.getString("code") + "\",";
    	result += "\"sang\":" + "\"" + rs.getString("sang") + "\",";
    	result += "\"su\":" + "\"" + rs.getString("su") + "\",";
    	result += "\"dan\":" + "\"" + rs.getString("dan") + "\"";
    	result += "},";
   }
   if(result.length()>0){
	   result = result.substring(0, result.length()-1);
   }
   out.print(result);
   rs.close();
   pstmt.close();
   conn.close();
   
} catch (Exception e) {
   System.out.println("처리 실패 : " + e);
}
%>
]
}

