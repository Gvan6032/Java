package hw_9.task_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task3 {
    public static void main (String [] args){
        try(FileInputStream fin = new FileInputStream("E://Java//Java_homework//Gvan6032//src//hw_9//task_2//note2.txt")){
            System.out.printf("File size: %d bytes",fin.available());
            int i =-1;
            while((i=fin.read())!=-1){
                System.out.printf(String.valueOf((char)i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
