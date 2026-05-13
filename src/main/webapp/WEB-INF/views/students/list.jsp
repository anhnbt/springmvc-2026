<%--
  Created by IntelliJ IDEA.
  User: anhnbt
  Date: 08/05/2026
  Time: 7:40 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<div>${message}</div>
<table>
    <tr>
        <th>Name</th>
        <th>Classes</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.name}</td>
            <td>${student.classes}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
