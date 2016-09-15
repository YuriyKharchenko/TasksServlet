package ua.goit.java.servlet;

import ua.goit.java.database.dao.Dao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EditTask", urlPatterns = {"/edit"})
public class EditTask extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idTemp = request.getParameter("id");
        int id = Integer.parseInt(idTemp);
        request.setAttribute("getTaskById", Dao.getTaskById(id));
        RequestDispatcher rd = request.getRequestDispatcher("/JSP/EditTask.jsp");
        rd.forward(request, response);
    }
}
