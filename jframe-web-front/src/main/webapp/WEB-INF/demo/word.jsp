<%@ page language="java" import="java.util.Date" contentType="application/msword;charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();
String port=request.getServerPort()==80?"":":"+request.getServerPort();
String basePath = request.getScheme()+"://"+request.getServerName()+port+path+"/";%>
<% response.setHeader("Content-disposition","attachment;filename="+new Date().getTime()+".doc");%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>" />
<meta charset="utf-8" />
<title></title>
</head>

<body>
<h1>测试Word</h1>
<h2>测试Word</h2>
<p>dasdqwedqweqeqwd</p>
</body>
</html>