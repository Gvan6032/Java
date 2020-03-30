package springCW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Circle {

    Hourse hourse;
    //public Circle(Hourse hourse){
    //    this.hourse = hourse;
    //}

    public void perfomance(){
        System.out.println("Action!");
        hourse.run();
    }

    public Hourse getHourse() {
        return hourse;
    }

    public void setHourse(Hourse hourse) {
        this.hourse = hourse;
    }
}
