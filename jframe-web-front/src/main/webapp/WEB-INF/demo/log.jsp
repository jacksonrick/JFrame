<%@ page import="java.io.*,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String port = request.getServerPort() == 80 ? "" : ":" + request.getServerPort();
	String basePath = request.getScheme() + "://" + request.getServerName() + port + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<title>日志监控</title>
<style type="text/css">
body {
	background-color: black;
	color: white;
	font-family: 'Consolas';
}
</style>
</head>

<body>
	<%
		//String filePath = "/opt/webserver/logs/";
		String date=request.getParameter("date");
		String name="demo";
		if(date!=null && !"".equals(date)){
			name="demo."+date+".log";
		}
		String filePath="D:/Developer/Java/apache-tomcat-6.0/logs/"+name;
		
		BufferedReader reader=null;
		try{
			reader=new BufferedReader(new FileReader(filePath));
			String line=null;
		    while((line=reader.readLine())!=null){
	    	%>
				<%=line + "<br/>"%>
			<%
		    }
		}catch(Exception e){
			throw e;
		}finally{
			reader.close();
		}
	%>

</body>
</html>