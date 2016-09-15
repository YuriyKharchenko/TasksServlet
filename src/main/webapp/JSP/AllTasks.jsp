<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>All Tasks</title>
</head>
<body>

<div style="width: 1200px; margin-left: auto; margin-right: auto;">
    <table cellpadding="10">
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Category</th>
            <th>Complete</th>
            <th></th>
        </tr>
        <c:forEach items="${AllTasks}" var="p">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.category}</td>
                <td>${p.complete}</td>
                <td>
                    <a href="edit?id=${p.id}">Edit</a>
                    <a href="delete?id=${p.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>

</div>
</table>
</body>
</html>