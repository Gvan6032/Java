package springAutoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Audi {
    private String model;

    public Audi(){
        model = "Q7";
    }

    @Autowired
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
