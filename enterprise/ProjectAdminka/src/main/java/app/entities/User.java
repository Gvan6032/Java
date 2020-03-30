package app.entities;

import org.jetbrains.annotations.Contract;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.List;

public class User {
    private String nameUser;
    private String passwordUser;
    private String ageUser;
    private String emailUser;
    private String infoUser;
    private String adminCheck;

    public User(String nameUser, String passwordUser, String ageUser, String emailUser, String adminCheck) {
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
        this.ageUser = ageUser;
        this.emailUser=emailUser;
        this.adminCheck = adminCheck;
        this.infoUser = nameUser+" "+ageUser+" "+emailUser+" "+adminCheck;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPaswordUser() {
        return passwordUser;
    }

    public void setPaswordUser(String paswordUser) {
        this.passwordUser = paswordUser;
    }

    public String getAgeUser() {
        return ageUser;
    }

    public void setAgeUser(String ageUser) {
        this.ageUser = ageUser;
    }

    public String getEmailUser() {
       return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getInfoUser() {
        return infoUser;
    }

    public void setInfoUser(String infoUser) {
        this.infoUser = infoUser;
    }

    public String getAdminCheck() {
        return adminCheck;
    }

    public void setAdminCheck(String adminCheck) {
        this.adminCheck = adminCheck;
    }
}




