package app.servlets;

import app.entities.Model;
import app.entities.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String[] users = new String[]{"Tom", "Bob", "Sam"};
        Model model = Model.getInstance();
        List<String> users = model.allUsers();
        req.setAttribute("users",users);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/list.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // String checkName = req.
        //String checkAdmin = req.getParameter("admin");
       // String checkOn = "on";
       // if (checkAdmin.equals(checkOn)){
        //    RequestDispatcher requestDispatcher = req.getRequestDispatcher("/list.jsp");
         //   requestDispatcher.forward(req,resp);
        //}
    }
}
