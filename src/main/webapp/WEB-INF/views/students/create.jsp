<%--
  Created by IntelliJ IDEA.
  User: anhnbt
  Date: 08/05/2026
  Time: 7:43 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Create Student</title>
</head>
<body>
<div>${message}</div>
<form action="create" method="post" enctype="multipart/form-data">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${student.name}" required><br>
    <label>Tuoi: </label>
    <input type="number" id="age" name="age" value="${student.age}" required><br>
    <label>Lop hoc: </label>
    <input type="text" id="classes" name="classes" value="${student.classes}" required><br>
    <label>Avatar</label>
    <input type="file" name="avatar" id="avatar"><br>
    <button type="submit">Create</button>
</form>
</body>
</html>
