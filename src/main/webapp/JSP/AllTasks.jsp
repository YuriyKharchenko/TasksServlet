<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>All Tasks</title>
    <%--<link href="/css/bootstrap.min.css" rel="stylesheet"/>--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<h2>
    <%--<a href="AddNew.html">Add new task</a>--%>

</h2>

<div class="form-group">
    <label class="col-sm-2 control-label"> </label>
    <a href="AddNew.html" button type="submit" class="btn-lg btn-danger">Add Task</a></button>
</div>

<div style="width: 1200px; margin-left: auto; margin-right: auto;">
    <table border="1" width="1000px" class="table table-bordered">
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