package ua.goit.java.servlet;

import ua.goit.java.database.dao.Dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteTask", urlPatterns = {"/delete"})
public class DeleteTask extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idTemp = request.getParameter("id");
        int id = Integer.parseInt(idTemp);
        Dao dao = new Dao();
        dao.delete(id);
        response.sendRedirect("/crud/AllTasks");

    }
}
