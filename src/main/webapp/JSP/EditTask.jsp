<%--
  Created by IntelliJ IDEA.
  User: uras
  Date: 15.09.2016
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

    <title>Edit</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
    <h1>Edit task</h1>
    <div style="width: 50%; margin-left: 20px" class="brd">
        <c:forEach items="${getTaskById}" var="p">
            <form class="form-horizontal" action="JSP/ManageEditTask.jsp" method="post">
                <%--<input type="hidden" value="${p.id}">--%>
                <br>
                <input  type="hidden" value="${p.id}" name="ID" style="width:50px" >
                Name:<br>
                <input class="form-control" type="text" value="${p.name}" name="name" style="width:200px" >
                Category:
                <select name="category">
                    <option value="${p.category}">${p.category}</option>
                    <option value="Second">Second</option>
                    <option value="Third">Third</option>
                </select><br>
                Complete:
                <select name="complete">
                    <option value="${p.complete}">${p.complete}</option>
                    <option value="No">No</option>
                </select><br>
                <input type="submit" value="Submit">
            </form>
        </c:forEach>

    </div>
</body>
</html>
