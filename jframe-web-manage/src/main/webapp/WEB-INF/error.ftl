<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Error</title>
    <link rel="shortcut icon" href="/static/theme/images/favicon.ico"/>
    <link rel="stylesheet" href="/static/common/404/style.css"/>
</head>

<body>
<div class=bg>
    <div class=cont>
        <div class=c1>
            <img class=img1 src="/static/common/404/01.png">
        </div>
        <h2>Sorry…您访问的页面发生错误了</h2>
        <DIV class=c2>
            <a class=re href="/">返回首页</a>
            <a class=home href="javascript:location.reload();">重新加载</a>
        </div>
        <div class=c3>
            错误信息：${msg}
        </div>
    </div>
</div>
</body>
</html>