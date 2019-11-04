package hw_9.task_4;

import java.io.Serializable;

public class Employee extends Work implements Serializable {
    public String name;
    private int age;
    private Work work;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.work = new Work();
    }

    public String toString() {
        return "Employee{" +
                "name'" + name + '\'' +
                ", age =" + age +
                ", nameWork=" + work.nameWork +
                ", Min experience=" + work.minExperienceWork+
                '}';
    }
}
