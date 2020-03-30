package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("fiat")
public class Fiat {
    @Autowired
    public String name = "Fiat";

    public void fiatHello(){
        System.out.println("Третий пошёл!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
