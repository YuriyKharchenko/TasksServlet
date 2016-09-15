<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="ua.goit.java.model.Task" %>
<%@ page import="ua.goit.java.database.dao.Dao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Add new</title>
</head>
<body>

    <%
//        Date dateTemp = new Date((System.currentTimeMillis()));
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//        String date = dateFormat.format(dateTemp.getTime());

        int id = Integer.parseInt(request.getParameter("ID"));
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        String complete = request.getParameter("complete");

        Task task = new Task(id, name, category, complete);
        System.out.println(task.toString());
        Dao dao = new Dao();
        dao.addTask(task);


        response.sendRedirect("/crud/AllTasks");
    %>
</table>
</body>
</html>
