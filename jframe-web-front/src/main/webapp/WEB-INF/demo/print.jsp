<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

<button onclick="p()">打印</button>
<div id="content" style="color: red;">
	<h1>dasdq1213</h1>
	<p>dasdqweqwejio</p>
	<p>dasdqweqwejio</p>
	<p>dasdqweqwejio</p>
</div>

<h3>dasidqweuqd</h3>

<script type="text/javascript" src="/static/library/jquery/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-migrate-1.1.0.js"></script><!-- opera -->
<script type="text/javascript" src="/static/library/plugins/print/jquery.jqprint-0.3.js"></script>
<script type="text/javascript">
	function p(){
		$("#content").jqprint();
	}
</script>
</body>
</html>