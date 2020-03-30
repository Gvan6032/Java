package entitites;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable {
    private int idUser;
    private String nameUser;
    private String ageUser;
    private String sexUser;
    private String passUser;
    private String emailUser;
    private boolean adminUser;

    public Person() {
    }

    public Person(String nameUser, String ageUser, String sexUser, String emailUser, Boolean adminUser, String passUser) {
        this.nameUser = nameUser;
        this.ageUser = ageUser;
        this.sexUser = sexUser;
        this.emailUser=emailUser;
        this.adminUser=adminUser;
        this.passUser = passUser;
        this.idUser = 0;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getAgeUser() {
        return ageUser;
    }

    public void setAgeUser(String ageUser) {
        this.ageUser = ageUser;
    }

    public String getSexUser() {
        return sexUser;
    }

    public void setSexUser(String sexUser) {
        this.sexUser = sexUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPassUser() {
        return passUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    public boolean getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(Boolean adminUser) {
        this.adminUser = adminUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public boolean isAdminUser() {
        return adminUser;
    }

    public void setAdminUser(boolean adminUser) {
        this.adminUser = adminUser;
    }

    @Override
    public String toString() {
        String info = idUser+ '\'' + nameUser + '\''+ ageUser + '\'' + sexUser + '\''+ passUser + '\'' +
                emailUser + '\'' +
                adminUser + '\'';
        return  info;
    }
}
