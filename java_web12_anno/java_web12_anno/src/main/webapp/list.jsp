<%@page import="pack.mybatis.SqlMapConfig"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="pack.business.DataDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
            type: "GET", // 요청을 보내고
            url: "list2.jsp", // list2.jsp에서 고객 데이터를 가져올꺼임
            data: { jikwon_name: jikwon_name }, // 직원 이름을 파라미터로 전달
            dataType: "json",
            success: function(data) {
            	// 직원 클릭하면 화면에 어떻게 고객정보가 출력되게 하고싶은지 작성하고
                if (data.length > 0) {
                    let customerData = data[0]; // 배열이자나 [0]이 첫번째인건 기본 ㅇㅈ? 여기 이해한되는 사람 이거 설명 잘보샘!(틀릴수도 있음 ㅋㅋ틀렸으면 말해줘)
                    							// AJAX 요청을 해서 서버에서 가져온 JSON 데이터에의 첫 번째 고객 정보를 customerData 변수에 저장하고,
                    							// 이후에 해당 데이터를 HTML에 표시할려고 하는거임
                    let tableHtml = "<table border='1'>"; // 이건 고객 정보를 테이블로 출력할려고~ html이랑 똑같음 여기서 table열고
                    tableHtml += "<tr><th>고객 번호</th><th>고객 이름</th><th>고객 전화번호</th><th>고객 주민번호</th><th>성별</th></tr>";
                    tableHtml += "<tr>";
                    tableHtml += "<td>" + customerData.gogek_no + "</td>";
                    tableHtml += "<td>" + customerData.gogek_name + "</td>";
                    tableHtml += "<td>" + customerData.gogek_tel + "</td>";
                    tableHtml += "<td>" + customerData.gogek_jumin + "</td>";
                    tableHtml += "<td>" + customerData.gender + "</td>"; //**4. 성별 정보 추가하면 이제 성별 나온다!
                    tableHtml += "</tr>";
                    tableHtml += "</table>"; //table닫고
                    $("#customerData").html(tableHtml); // 이렇게 작성하면 테이블을 HTML 요소에 추가 할수있음!
                } else {
                    $("#customerData").html("해당 직원은 담당 고객이 없습니다.");
                }
            },
            error: function() {
                alert("customer err data.");
            }
        });
    }
    </script>
</head>
<body>
	<h2>* 직원 정보 *</h2>
	<table border="1">
		<tr><th>사번</th><th>이름</th><th>직급</th><th>성별</th><th>연봉</th></tr>
		<!-- 직원 정보를 가져와서 테이블에 표시할꺼임-->
		<c:set var="list" value="${process.selectDataAll()}" />
		<!-- 직원 정보가 없을 경우에 대한 처리인데 딱히 필요없을지도?-->
		<c:if test="${empty list }">
			<tr>
				<td colspan="5">직원 자료 없음</td>
			</tr>
		</c:if>
		<c:forEach var="m" items="${list}">
			<tr>
				<td>${m.jikwon_no}</td>
				<!-- **직원 이름을 클릭하면 showCustomerData 함수를 호출하도록 설정한거임!!!** -->
				<td><a href="javascript:void(0);"
					onclick="showCustomerData('${m.jikwon_name}')">${m.jikwon_name}</a></td>
				<td>${m.jikwon_jik}</td>
				<td>${m.jikwon_gen}</td>
				<td><fmt:formatNumber value="${m.jikwon_pay}" pattern="#,###" /></td>
			</tr>
		</c:forEach>
	</table>
	<!-- 고객 데이터를 표시할 거. (엘리먼트(element) 라고도 하는듯?) -->
	<div id="customerData"></div>
</body>
</html>