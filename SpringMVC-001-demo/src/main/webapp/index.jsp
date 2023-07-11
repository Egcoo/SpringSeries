<%--
  Created by IntelliJ IDEA.
  User: Egcoo
  Date: 2023/7/1
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<a href="${pageContext.request.contextPath}/demo.action">访问服务器......</a>--%>
<br><br><br>
<h2>1.单个数据提交</h2>
<form action="${pageContext.request.contextPath}/one.action" method="post">
    姓名:<input name="myname"><br>
    年龄:<input name="age"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
