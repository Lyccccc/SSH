<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2017/07/11
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="item">
    <c:out value="${item.message}"></c:out>
    <br />
</c:forEach>
--------------------
<br/>
<c:out value="${userName}"></c:out>
--------------------
<br/>
<c:out value="${spittle}"></c:out>
</body>
</html>
