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
    <title>景区列表</title>
</head>
<body class="page-header-fixed">
<%@ include file="pageHeader.jsp"%>
<div class="page-container"  style="margin-top: 50px">
    <%@ include file="menu.jsp"%>
<div class="page-content">
<table class="table table-striped">
 <tr>
     <td>景区编码</td>
     <td>景区名称</td>
     <td>景区地点</td>
     <td>景区描述</td>
 </tr>
<c:forEach var="space" items="${spacelist}">
    <tr>
        <td>${space.spaceName}</td>
    </tr>
</c:forEach>
</table>
    </div>
    </div>
</body>
</html>