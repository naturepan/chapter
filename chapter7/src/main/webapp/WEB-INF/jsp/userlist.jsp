<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/4/15
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title><fmt:message key="website.title"></fmt:message></title>
</head>
<body>
<fmt:message key="user.userList.title"/>
<table>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td><a  href="admin/user/showuser/${user.userName}">${user.userName}</a></td>
            <td>${user.passWord}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
