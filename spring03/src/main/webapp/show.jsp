<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:forEach items="${list}" var="dep">
        ${dep.depid}ccc${dep.depname}aaa<br>
    </c:forEach>

</body>
</html>
