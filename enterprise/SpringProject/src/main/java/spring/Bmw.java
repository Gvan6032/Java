package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Bmw {
    @Autowired
    private String name="BMW";

    public void bmwHell(){
        System.out.println("Второй пошёл!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
