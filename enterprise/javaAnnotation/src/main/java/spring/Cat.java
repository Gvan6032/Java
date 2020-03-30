package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan("spring")
public class Cat {
    private String name;
    private String kind;

    public Cat(){
        name="Kitty";
        kind = "Siam";
    }
    @Autowired
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Autowired
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
