<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../js/script.js"></script>
<script type="text/javascript">
window.onload = function(){
	document.querySelector("#btnAdminLogin").onclick = funcAdminLogin;
	document.querySelector("#btnAdminHome").onclick = funcAdminHome;
};

function funcAdminLogin(){
	//alert("a");
	if(adminLoginForm.adminid.value === ""){
		alert("관리자 id를 입력하세요")
		adminLoginForm.adminid.focus();
		return;
	}
	
	if(adminLoginForm.adminpwd.value === ""){
		alert("관리자 passwd를 입력하세요")
		adminLoginForm.adminpwd.focus();
		return;
	}
	
	adminLoginForm.submit();
}

function funcAdminHome(){
	//alert("b");
	location.href = "../guest/guest_index.jsp";
}

</script>
</head>
<body>
<form action="adminloginproc.jsp" name="adminLoginForm" method="post">
<table style="width: 300">
 	<tr>
 	 	<td colspan="2" style="text-align: center;">* 관리자 로그인 *</td>
 	</tr>
 	<tr>
 	 	<td>i d : </td>
 	 	<td><input type="text" name="adminid"></td>
 	</tr>
 	<tr>
 	 	<td>pwd : </td>
 	 	<td><input type="text" name="adminpwd"></td>
 	</tr>
 	<tr>
 	 	<td colspan="2" style="text-align: center;">
 	 	<input type="button" value="관리자 로그인" id="btnAdminLogin">
 	 	<input type="button" value="메인 페이지" id="btnAdminHome">
 	 	</td>
 	</tr>
</table>
</form>
</body>
</html>