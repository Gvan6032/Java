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
import org.apache.log4j.Logger;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static Logger log = Logger.getLogger(Person.class);
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String sex = req.getParameter("sex");
        String pass = req.getParameter("password");
        String email = req.getParameter("email");
        String admin = req.getParameter("admin");
        log.info("Request.getParameter;");
        //Boolean adminCheck;
        Person person = new Person();
        log.info("Creating an instance of a class Person;");
        person.setNameUser(name);
        person.setAgeUser(age);
        person.setSexUser(sex);
        person.setEmailUser(email);
        person.setPassUser(pass);
        if (admin.equals("Admin")){
            person.setAdminUser(true);
            log.info("Checking admin rights;");
        }
        else person.setAdminUser(false);
        PersonCRUD personCRUD = PersonCRUD.getInstance();
        personCRUD.addPerson(person);
        List<String> allUsers = personCRUD.allPersons();
        req.setAttribute("users", allUsers);
        String path= "/index.jsp";
        if(person.getAdminUser()==true){
            path="/allUsers.jsp";
        }
        else path="/userPage.jsp";
        RequestDispatcher requestDispatcher= req.getRequestDispatcher(path);
        requestDispatcher.forward(req,resp);
        doGet(req,resp);
    }
}
