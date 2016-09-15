<%@ page import="ua.goit.java.database.dao.Dao" %><%--
  Created by IntelliJ IDEA.
  User: uras
  Date: 15.09.2016
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            int id = Integer.parseInt(request.getParameter("ID"));
            String name = request.getParameter("name");
            String category = request.getParameter("category");
            String complete = request.getParameter("complete");

            Dao dao = new Dao();
            dao.edit(id, name, category, complete);

            response.sendRedirect("/crud/AllTasks");

        %>
</body>
</html>
