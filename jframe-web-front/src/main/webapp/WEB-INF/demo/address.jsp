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

<div class="container">
	<form action="" class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">Addr：</label>
			<div class="col-md-5">
				<input id="city-picker" class="form-control" readonly type="text" value="" data-toggle="city-picker" placeholder="选择省市区">
			</div>
		</div>
	</form>
</div>
<script src="/static/common/js/global.js"></script>
<script type="text/javascript">
$(function(){
	cityPicker("#city-picker");
})
</script>
</body>
</html>