package hw_9.task_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// форматируй код
public class Task2 {
    public static void main(String [] args) throws FileNotFoundException {
        /*Есть некоторый текст, его нужно записать в файл. Можно использовать одно и тоже
        предложение, запишите его 10.000 раз*/
        // путь к файлу в константу
        try(FileOutputStream fos = new FileOutputStream("E://Java//Java_homework//Gvan6032//src//hw_9//task_2//note2.txt")){
           String line = "No man is an island ";
           for (int i=1; i<=10000;i++) { // 10_000 - в переменную
               byte[] buffer = line.getBytes();
               fos.write(buffer, 0, buffer.length);
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
