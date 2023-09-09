<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="pack.business.DataDto" %>
<%@ page import="pack.business.ProcessImpl" %>

<%
//직원 이름 파라미터를 가져옴
String jikwon_name = request.getParameter("jikwon_name");

// 이거는 Java 서버 페이지(jsp)에서 사용하는 코드임
// 인스턴스를 사용하여 데이터를 조회하고 가공하여 클라이언트로 전송하는거임(클래스,객체,인스턴스는 대충은 알껄로 생각함)
ProcessImpl process = new ProcessImpl();

//이건 직원 이름에 해당하는 고객 데이터를 가져오는거
List<DataDto> customerData = process.selectDataAll2(jikwon_name);

// JSON 데이터 생성
String Result = "[";
for (DataDto dto : customerData) {
    Result += "{";
    Result += "\"gogek_no\":\"" + dto.getGogek_no() + "\",";
    Result += "\"gogek_name\":\"" + dto.getGogek_name() + "\",";
    Result += "\"gogek_tel\":\"" + dto.getGogek_tel() + "\",";
    Result += "\"gogek_jumin\":\"" + dto.getGogek_jumin() + "\",";
    Result += "\"gender\":\"" + dto.getGender() + "\""; //**3. 성별 정보를 추가 - list.jsp로 ㄱㄱ
    Result += "},";
}
if (!customerData.isEmpty()) {
    Result = Result.substring(0, Result.length() - 1);
}
Result += "]";

//JSON 데이터 출력
out.print(Result);
%>