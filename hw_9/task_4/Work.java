package hw_9.task_4;

import java.io.Serializable;

// форматируй код
public class Work implements Serializable {
    public String nameWork;
    public int minExperienceWork;

    public Work(){
        this.nameWork= "JSC InOP";
        this.minExperienceWork = 2;
    }
}
