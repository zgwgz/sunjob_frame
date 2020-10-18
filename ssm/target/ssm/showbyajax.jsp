<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <script src="js/jquery-1.4.2.min.js"></script>
    <script >
        //入口函数
        $(function () {
            $.ajax({
                type:"post",
                url:"dep.do?findbyaj",
                success:function (data) {
                   for (var i=0;i<data.length;i++){
                       var option = new Option(data[i].depname , data[i].depid);
                       document.getElementById("dep").append(option);
                   }
                },
                error:function () {
                  alert("失败")
                },
                dataType:"json"
            })


        });
    </script>
</head>
<body>

<select id="dep" >

</select>
</body>

</html>
