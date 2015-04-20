<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/4/16
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>
<form method="post" action="<c:url value="/admin/upload"/>" enctype="multipart/form-data">
    <input type="text" name="name"/>
    <input type="file" name="file"/>
    <input type="submit">
</form>

</body>
</html>
