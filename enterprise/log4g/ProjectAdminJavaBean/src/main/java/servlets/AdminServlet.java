package servlets;

import entitites.Person;
import entitites.PersonCRUD;

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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String path = "/error.jsp";
        PersonCRUD person = PersonCRUD.getInstance();
        List<String> users = person.allPersons();
        req.setAttribute("users", users);
        if(login.isEmpty()==true && password.isEmpty()==true)
        {
            path = "/error.jsp";
        }
        else
        {
            for(int i=0;i<users.size();i++){
                if (users.get(i).contains(login)&& users.get(i).contains(password)){
                    path = "/allUsers.jsp";
                }
                else{
                    path="/error.jsp";
                }
            }
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
        requestDispatcher.forward(req,resp);
    }
}
