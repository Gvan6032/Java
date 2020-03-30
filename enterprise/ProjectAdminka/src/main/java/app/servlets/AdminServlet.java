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
import java.util.List;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String checkName = req.getParameter("name");
        String checkPassword = req.getParameter("password");
        String path = "/user.jsp";
        String admin = "admin";
        RequestDispatcher requestDispatcher;
        Model model = Model.getInstance();
        String user = model.checkPassword(checkName,checkPassword);
        List<String> users = model.allUsers();
        req.setAttribute("users",users);
        if (user.equals(admin))
        {
           path = "/list.jsp";
        }
        requestDispatcher = req.getRequestDispatcher(path);
        requestDispatcher.forward(req, resp);
    }
}
