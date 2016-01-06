<%--
  Created by IntelliJ IDEA.
  User: idoulao java
  Date: 2015/12/31
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
</head>
<body>
    <h3>hello shiro</h3>

<form action="<%=request.getContextPath()%>/login" method="post">
    loginName:<input type="text" name="username">
    loginPassword:<input type="text" name="password">
    <input type="submit" value="login">

</form>
</body>
</html>
