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
<style type="text/css">
</style>
    <link href="/static/common/css/bootstrap.min.css" type="text/css" rel="stylesheet">
</head>

<body>

<div class="container login">
	<form class="form-horizontal" action="dologin.do" method="post" id="login-form-win">
		<div class="form-group">
			<label class="col-sm-3 control-label">登录账号</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" name="account" placeholder="邮箱、手机号、用户名" autofocus="autofocus">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-3 control-label">密码</label>
			<div class="col-sm-7">
				<input type="password" class="form-control" name="passwd" placeholder="输入密码">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-6">
				<button type="submit" class="btn btn-info btn-w">登录</button>
			</div>
		</div>
	</form>
</div>

<%@ include file="../include/footer.jsp" %>
<script type="text/javascript" src="/static/library/jquery/jquery.form.js"></script>
<script type="text/javascript" src="/static/library/bootstrap/js/bootstrapValidator.js"></script>
<script type="text/javascript" src="/static/theme/default/js/validator.js"></script>

</body>
</html>