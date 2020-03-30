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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = "/index.jsp";
        String login = req.getParameter("login");
        String passEnter = req.getParameter("passwordEnter");
        Person person = new Person();
        PersonCRUD personCRUD = PersonCRUD.getInstance();
        List<String> allUsers = personCRUD.allPersons();
        req.setAttribute("users", allUsers);
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String sex = req.getParameter("sex");
        String pass = req.getParameter("password");
        String email = req.getParameter("email");
        String admin = req.getParameter("admin");
        Boolean adminCheck;
        person.setNameUser(name);
        person.setAgeUser(age);
        person.setSexUser(sex);
        person.setEmailUser(email);
        person.setPassUser(pass);
        if (name.equals("")){
            path = check(login,passEnter,allUsers);
        }
        else{
            personCRUD.addPerson(person);
            if (admin.equals("Admin")) {
                person.setAdminUser(true);
            } else person.setAdminUser(false);
            if (person.getAdminUser() == true) {
                path = "/allUsers.jsp";
            } else path = "/userPage.jsp";
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(path);
        requestDispatcher.forward(req, resp);
        doGet(req, resp);
    }

    public String check(String login, String password, List<String> allUsers) {
        String path="";
        if ((login.equals("login") && login.equals("password")) || login.equals("login") || login.equals("password"))
        {
            path = "/error.jsp";
        }
        else {
            for (int i = 0; i < allUsers.size(); i++) {
                if (allUsers.get(i).contains(login) && allUsers.get(i).contains(password)) {
                    path = "/userPage.jsp";
                }
            }
        }
        return path;
    }

}
