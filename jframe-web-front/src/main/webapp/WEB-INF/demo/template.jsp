<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% String path = request.getContextPath();
    String port = request.getServerPort() == 80 ? "" : ":" + request.getServerPort();
    String basePath = request.getScheme() + "://" + request.getServerName() + port + path + "/";%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <title>Template</title>
</head>

<body>
<table id="content"></table>
<script id="test" type="text/html">
    {{each data as value i}}
    <tr>
        <td>{{value.realname}}</td>
        <td>{{value.phone}}</td>
        <td>{{value.addr}}</td>
    </tr>
    {{/each}}
</script>

<script src="/static/library/plugins/template/template.js"></script>
<script>
    var list= {
        data : [
            {"realname":"许","phone":"188","addr":"安徽"},
            {"realname":"许","phone":"177","addr":"安徽"},
            {"realname":"许","phone":"166","addr":"安徽"}
        ]
    }
    var html = template('test', list);
    console.log(html)
    document.getElementById('content').innerHTML = html;
</script>
</body>

</html>