package ua.goit.java.servlet;

import ua.goit.java.database.dao.Dao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AllTasks", urlPatterns = {"/AllTasks"})
public class AllTasks extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("AllTasks", Dao.getAll());
        System.out.println("GetAll done!");
        RequestDispatcher rd = request.getRequestDispatcher("/JSP/AllTasks.jsp");
        rd.forward(request, response);
    }
}
