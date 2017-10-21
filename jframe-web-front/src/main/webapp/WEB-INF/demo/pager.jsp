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

<div class="container">
	<h3>分页控件测试</h3>
	<form action="pager.do" method="get" id="userListForm">
		<input type="text" class="form-control" name="name" value="${name }" placeholder="用户名"/>
		<input type="text" class="form-control" name="regDate" id="datetimepicker" value="${regDate }" placeholder="注册时间" />
		<button type="submit" class="btn btn-primary">查询</button>
	</form>
	<table class="table">
		<thead>
			<tr>
				<td>序号</td>
				<td>用户</td>
				<td>手机</td>
				<td>注册时间</td>
				<td>状态</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${pagination.list }" var="v" varStatus="vs">
				<tr>
					<td>${vs.index+1 }</td>
					<td>${v.username }</td>
					<td>${v.phone }</td>
					<td><fmt:formatDate value="${v.createDate }" pattern="yyyy-MM-dd HH:mm" var="d"></fmt:formatDate>${d }</td>
					<td>${v.status==1?'正常':'冻结' }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<mytag:Pagination pagination="${pagination}" queryForm="userListForm" /> 
</div>

<script type="text/javascript" src="/static/library/bootstrap/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript">
$(function(){
	datePicker('#datetimepicker',"yyyy-mm-dd",2);
})
</script>
</body>
</html>