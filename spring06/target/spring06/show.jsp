<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/10/13
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${list}" var="dep">
    ${dep.depname}
</c:forEach>





</body>
</html>
