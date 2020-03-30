package servlets;

import entitites.Person;
import entitites.PersonCRUD;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = getInitParameter("id");
        PersonCRUD personCRUD = PersonCRUD.getInstance();
        List<String> allUsers = personCRUD.allPersons();
        req.setAttribute("users", allUsers);
        personCRUD.deletePerson(Integer.parseInt(id));
    }
}
