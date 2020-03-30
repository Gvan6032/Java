package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Audi {
    @Autowired
    private String nameAudi = "Audi";
    public void audiHello(){
        System.out.println("Первый пошёл!");
    }

    public String getNameAudi() {
        return nameAudi;
    }

    public void setNameAudi(String nameAudi) {
        this.nameAudi = nameAudi;
    }
}
