<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="dep">
        ${dep.depid}cccccc${dep.depname}
        <a href="dep.do?delById&depid=${dep.depid}">删除</a>

        <br>
    </c:forEach>
</body>
</html>
