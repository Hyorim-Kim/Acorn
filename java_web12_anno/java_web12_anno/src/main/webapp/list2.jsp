<%@page import="java.util.List"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="pack.mybatis.SqlMapConfig"%>
<%@page import="pack.business.SqlMapperInter"%>
<%@page import="org.apache.ibatis.session.SqlSessionFactory"%>
<%@page import="pack.business.DataDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="process" class="pack.business.ProcessImpl" />

<h3>고객 정보 (${jikwon_name}고객)</h3>
<%
String jikwon_name = request.getParameter("jikwon_name");
ArrayList<DataDto> customerList = (ArrayList)process.selectDataAll2(jikwon_name);
SqlSessionFactory factory = SqlMapConfig.getSqlSession();
SqlSession sqlSession = factory.openSession();
List<DataDto> list = null;
SqlMapperInter inter = (SqlMapperInter)sqlSession.getMapper(SqlMapperInter.class);
list = inter.selectDataAll();
if(sqlSession != null) sqlSession.close();

String result = "";
for(DataDto d:list){  //{"code":"100","sang":"glove"}
    result += "{";
    result += "\"gogek_no\":" + "\"" + d.getGogek_no() + "\",";
    result += "\"gogek_name\":" + "\"" + d.getGogek_name() + "\",";
    result += "\"gogek_tel\":" + "\"" + d.getGogek_tel() + "\",";
    result += "\"gogek_jumin\":" + "\"" + d.getGogek_jumin() + "\"";
    result += "},";
 }
 if(result.length() > 0){
    result = result.substring(0,result.length() - 1);
 }
out.print(result);
%>