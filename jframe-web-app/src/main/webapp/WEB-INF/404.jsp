<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.jf.json.JSONUtils" %>
<%@ page import="com.jf.entity.ResMsg" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<%
    response.setCharacterEncoding("UTF-8");
    response.setContentType("application/json;charset=UTF-8");
    PrintWriter pw = response.getWriter();
    pw.print(JSONUtils.toJSONString(new ResMsg(new Integer(404), "接口不存在")));
    pw.flush();
    pw.close();
%>
</body>
</html>
