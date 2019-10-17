package hw_4.task_4;

import hw_4.task_1.Student;

public class Task4 {
    public static void main(String[] args)
    {
       Student studentFirst = new Student();
       Student studentSecond = new Student("Dock",23);
       studentFirst.setText("My hw__4");
       System.out.println(studentFirst.getText());
       System.out.println(studentSecond.getText());
    }
}
