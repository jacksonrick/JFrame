<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% String path = request.getContextPath();
    String port = request.getServerPort() == 80 ? "" : ":" + request.getServerPort();
    String basePath = request.getScheme() + "://" + request.getServerName() + port + path + "/";%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <link rel="stylesheet" href="/static/library/plugins/jf-city-picker/city.css">
    <link rel="stylesheet" href="/static/common/css/bootstrap.min.css">
    <script type="text/javascript" src="/static/library/jquery/jquery-1.11.2.min.js"></script>
    <script type="text/javascript" src="/static/library/plugins/jf-city-picker/city.js"></script>
    <style type="text/css">
        form {
            margin: 100px;
        }
    </style>
    <script>
        $(function () {
            $("#box").Address({
                level: 4,
                prov: '340000',
                city: '340100',
                area: '340102',
                street: '340102002'
            });

            $("#btn").click(function () {
                console.log($("form").serialize())
            })
        });
    </script>
</head>

<body>

<form><div class="form-inline" id="box"></div></form>
<button type="button" id="btn">button</button>

</body>
</html>
