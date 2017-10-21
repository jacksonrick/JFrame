<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();
String port=request.getServerPort()==80?"":":"+request.getServerPort();
String basePath = request.getScheme()+"://"+request.getServerName()+port+path+"/";%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="renderer" content="webkit">
    <title></title>
	<link rel="stylesheet" type="text/css" href="/static/library/plugins/webuploader/webuploader.css">
</head>

<body>
<div id="avatar" class="list"><a id="avatarBtn"></a></div>
<div id="avatar2" class="list"><a id="avatarBtn2"></a></div>


<script src="/static/library/jquery/jquery-2.1.1.min.js"></script>
<script src="/static/library/plugins/layer/mobile/layer.js"></script>
<script type="text/javascript" src="/static/library/plugins/webuploader/webuploader.js"></script>
<script type="text/javascript" src="/static/common/js/upload-app.js"></script>
<script>
    $(function () {
        $("#avatarBtn").AppUploader({
            id: "avatar",
            limit: 1
        });
        $("#avatarBtn2").AppUploader({
            id: "avatar2",
            limit: 2
        });
    });
</script>
</body>
</html>