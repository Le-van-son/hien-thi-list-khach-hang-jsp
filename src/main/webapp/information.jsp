<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/23/2022
  Time: 9:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customerlist</title>
</head>
<center><h1>CUSTOMER_LIST</h1></center>

<body>
<table border="1" cellspacing="5" cellpadding="0">
    <c:forEach items="${List}" var="a">
        <tr>
            <td>${a.name}</td>
            <td>${a.age}</td>
            <td>${a.dayofbirth}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
