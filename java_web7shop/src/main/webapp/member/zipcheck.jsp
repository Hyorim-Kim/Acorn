<%@page import="pack.member.ZipcodeDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="memberMgr" class="pack.member.MemberManager" />
<%
request.setCharacterEncoding("utf-8");

String check = request.getParameter("check");
String dongName = request.getParameter("dongName");

ArrayList<ZipcodeDto> zlist = memberMgr.zipcodeRead(dongName);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우편번호 검색</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../js/script.js"></script>
<script type="text/javascript">
window.onload=function(){
	document.querySelector("#btnZipFind").onclick=dongCheck;
	
	document.querySelector("#btnZipClose").onclick=function(){
		window.close();
	}
}

function dongCheck(){
	//alert("dong");
	if(zipForm.dongName.value === ""){
		alert("검색할 동이름을 입력하시오");
		zipForm.dongName.focus();
		return;
	}
	zipForm.submit();
}
</script>
</head>
<body>
<b>** 우편자료 검색 **</b>
<br/>
<form action="zipcheck.jsp" name="zipForm" method="post">
<table>
 	<tr>
 	 	<td>
 	 	 	동이름 입력 : <input type="text" name="dongName">
 	 	 	<input type="button" value="검색" id="btnZipFind" />
 	 	 	<input type="button" value="닫기" id="btnZipClose" />
 	 	 	<input type="hidden" name="check" value="n" />
 	 	</td>
 	</tr>
</table>
</form>
<%
if(check.equals("n")){  // n일때만 만남(y : x)
	if(zlist.isEmpty()){
%>
 	 	<b>검색 결과가 없습니다!!!</b>
<%
 	}else{   // 검색 결과 있음
%>
 	<table>
 	 	<tr>
 	 	 	<td>검색 자료를 입력하면 자동으로 주소가 입력된다</td>
 	 	</tr>
 	 	<tr>
 	 	 	<td>
<%	 	 	
 		 	for(int i=0; i<zlist.size(); i++){
 		 		ZipcodeDto dto = zlist.get(i);  // i부터 꺼냄
 		 		String zipcode = dto.getZipcode();
 		 		String area1 = dto.getArea1();
 		 		String area2 = dto.getArea2();
 		 		String area3 = dto.getArea3();
 		 		String area4 = dto.getArea4();
 		 		if(area4 == null) area4="";
%>
 				 	<%=zipcode%> <%=area1%> <%=area2%> <%=area3%> <%=area4%> <br/>
<% 
 		 	}
%> 	 	
 	 	 	</td>
 	 	</tr>
 	</table>
<%
	}
}
%>
</body>
</html>