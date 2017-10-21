<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp" %>
<% String path = request.getContextPath();
String port=request.getServerPort()==80?"":":"+request.getServerPort();
String basePath = request.getScheme()+"://"+request.getServerName()+port+path+"/";%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<title></title>
</head>

<body>
<% Date d=new Date(); %>

剩余天数：${mytag:getRemainDay(date) } <br>
格式化手机号码：${mytag:formatPhone("17730215423") } <br>
格式化银行卡号：${mytag:formatIdcard("340123199311012674") } <br>
格式化身份证号：${mytag:formatBankcard("6215581302002881824") } <br>
格式化金额：${mytag:formatMoney(1125623.0) } <br>
格式化金额： <fmt:formatNumber value="12.2356" pattern="##.##" minFractionDigits="2"></fmt:formatNumber><br>
格式化时间： <fmt:formatDate value="<%=d %>" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate><br>

</body>
</html>