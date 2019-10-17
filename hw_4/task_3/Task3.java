package hw_4.task_3;

import hw_4.task_1.Student;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {
    public static void main (String [] args)
    {
        Student[] studentArray = new Student[5];
        studentArray[0] = new Student("Anya", 23);
        studentArray[1] = new Student("Mary", 24);
        studentArray[2] = new Student("Anya",23);
        studentArray[3] = new Student("Tom",24);
        studentArray[4] = new Student("Tom",24);
        int count =0;
        Student student = new Student("Tom",24);
        for (int i=0; i<studentArray.length; i++) {
            if (student.equals(studentArray[i]))
            {
                count ++;
            }
        }

        System.out.println("Number of coinsidences: " + count);

    }
}
