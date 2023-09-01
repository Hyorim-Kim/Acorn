<%@page import="pack.mybatis.SqlMapConfig"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="pack.business.DataDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="process" class="pack.business.ProcessImpl" />

<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>직원 정보</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">
        function showCustomerData(jikwon_name) {
            $.ajax({
                type: "GET",
                url: "list2.jsp",
                data: { jikwon_name: jikwon_name },
                success: function(data) {
                    $("#customerData").html(data);
                },
                error: function() {
                    alert("Error fetching customer data.");
                }
            });
        }
    </script>
</head>
<body>
<h2>* 직원 정보 *</h2>
<table border="1">
    <tr><th>사번</th><th>이름</th><th>직급</th><th>성별</th><th>연봉</th></tr>
    <c:set var="list" value="${process.selectDataAll()}" />
    <c:if test="${empty list }">
        <tr><td colspan="5">직원 자료 없음</td></tr>
    </c:if>
    <c:forEach var="m" items="${list}">
        <tr>
            <td>${m.jikwon_no}</td>
            <td><a href="javascript:void(0);" onclick="showCustomerData('${m.jikwon_name}')">${m.jikwon_name}</a></td>
            <td>${m.jikwon_jik}</td>
            <td>${m.jikwon_gen}</td>
            <td><fmt:formatNumber value="${m.jikwon_pay}" pattern="#,###" /></td>
        </tr>
    </c:forEach>
</table>
<div id="customerData"></div>
</body>
</html>