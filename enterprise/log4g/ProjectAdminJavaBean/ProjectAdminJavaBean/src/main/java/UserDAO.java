import entitites.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {

    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_admin","root","customer13");
        }catch(Exception e){System.out.println(e);}
        return con;
    }

    public static int Save(Person person){
        int status =0;
        try{
            Connection connection = getConnection();
            PreparedStatement ps=connection.prepareStatement("insert into register(name,password,email,sex,age,role_admin) values(?,?,?,?,?,?,?)");
            ps.setString(1, person.getNameUser());
            ps.setString(2,person.getPassUser());
            ps.setString(3,person.getEmailUser());
            ps.setString(4,person.getSexUser());
            ps.setString(5,person.getAgeUser());
            ps.setString(6,person.getAdminUser().toString());
            status=ps.executeUpdate();


        }
        catch(Exception e){System.out.println(e);}
        return status;

    }
}
