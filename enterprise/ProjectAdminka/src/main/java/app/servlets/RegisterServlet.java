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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/register.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nameUser = req.getParameter("name");
        String passwordUser = req.getParameter("password");
        String ageUser = req.getParameter("age");
        String emailUser = req.getParameter("email");
        String adminCheck = req.getParameter("admin");
        User user = new User(nameUser,passwordUser,ageUser,emailUser,adminCheck);
        //User user = new User("Anya","*******","21","gvan@tut.by");
        Model model = Model.getInstance();
        model.addUser(user);
        //req.setAttribute("users", nameUser);
        doGet(req,resp);
    }
}
