<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();
String port=request.getServerPort()==80?"":":"+request.getServerPort();
String basePath = request.getScheme()+"://"+request.getServerName()+port+path+"/";%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link rel="stylesheet" href="/static/common/css/bootstrap.min.css">
<link href="//cdn.bootcss.com/select2/4.0.3/css/select2.min.css" rel="stylesheet">
</head>
<body>

<select id="sel_menu" multiple="multiple" class="form-control">
    <optgroup label="系统设置">
         <option value="1">用户管理</option>
         <option value="2">角色管理</option>
         <option value="3">部门管理</option>
         <option value="4">菜单管理</option>
    </optgroup>
    <optgroup label="订单管理">
         <option value="5">订单查询</option>
         <option value="6">订单导入</option>
         <option value="7">订单删除</option>
         <option value="8">订单撤销</option>
    </optgroup>
    <optgroup label="基础数据">
         <option value="9">基础数据维护</option>
     </optgroup>
</select>

<script type="text/javascript" src="/static/library/jquery/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="//cdn.bootcss.com/select2/4.0.3/js/select2.min.js"></script>
<script type="text/javascript">

	$(function() {
		$("#sel_menu").select2({
	        tags: true,
	        maximumSelectionLength: 3  //最多能够选择的个数
	    });
	});
	
</script>
</body>
</html>