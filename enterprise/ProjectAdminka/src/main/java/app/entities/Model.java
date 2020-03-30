package app.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model ourInstance = new Model();
    private List<User> model;

    public static Model getInstance() {
        return ourInstance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void addUser(User user){
        model.add(user);
    }

    public List<String> allUsers(){
        return model.stream()
                .map(User::getInfoUser)
                .collect(Collectors.toList());
    }

    public String checkPassword(String password, String name) {
        String user = "";
        List<String> allPasswords = model.stream()
                .map(User::getPaswordUser)
                .collect(Collectors.toList());
        List<String> allNames = model.stream()
                .map(User::getNameUser)
                .collect(Collectors.toList());
        List<String> allAdmin = model.stream()
                .map(User::getAdminCheck)
                .collect(Collectors.toList());
        int count1 = allNames.indexOf(name);
        int count2 = allPasswords.indexOf(password);
        if(count1!=-1){
            user="us";
        }
        if(count2!=-1){
            user=user.concat("er");
        }
        String userAdmin = allAdmin.get(count2);
        if(userAdmin.equals("on")){
            user="admin";
        }
        return user;
    }

}
