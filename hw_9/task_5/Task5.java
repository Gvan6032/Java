package hw_9.task_5;

import hw_9.task_4.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Task5 {
    public static void main (String [] args){
        try{
            readFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void readFile(){
    try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream("E://Java//Java_homework//Gvan6032//src//hw_9//task_4//note4.txt"))){
        Employee employee = (Employee) oin.readObject();
        System.out.printf(String.valueOf(employee));
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    }
}
