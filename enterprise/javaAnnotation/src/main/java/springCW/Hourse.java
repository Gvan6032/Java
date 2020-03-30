package springCW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Hourse {
    Circle circle;

    public void run(){
        System.out.println("Running!");
    }
}
