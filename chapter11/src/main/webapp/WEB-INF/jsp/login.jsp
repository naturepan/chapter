<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link href="./static/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="./static/js/bootstrap.min.js"></script>
    <title>login</title>
</head>
<body >
    <form action="<c:url value="/loginCheck.html"/>" method="post">
        <div class="form-group">
            <label>姓名：</label>
            <input id="userName" type="text" class="form-control" placeholder="userName">
        </div>
        <div class="form-group">
            <label>密码：</label>
            <input id = "pssWord" type="text" class="form-control" placeholder="passWord">
        </div>
        <button type="submit" class="btn btn-default">登陆</button>
        <button id="reg" type="submit" class="btn btn-default">注册</button>
    </form>
    </form>
</body>
</html>