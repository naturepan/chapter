<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>景区列表</title>
</head>
<body>
<table>
 <tr>
     <td>景区编码</td>
     <td>景区名称</td>
     <td>景区地点</td>
     <td>景区描述</td>
 </tr>
<c:forEach var="space" items="${spacelist.lists}">
    <tr>
        <td>${space.spaceName}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>