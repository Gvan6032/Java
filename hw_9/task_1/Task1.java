package hw_9.task_1;

import java.io.*;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) throws IOException {
        /*Есть массив чисел, заполнить его можете любыми цифрами. Нужно записать его в файл*/
        int[] array = new int[5];
        for(int i=0; i<array.length;i++){
            array[i] = i;
        }
        //запись в файл
        try(FileOutputStream fos = new FileOutputStream("E://Java//Java_homework//Gvan6032//src//hw_9//task_1//note.txt")){
            //перевод массив в строку, строку в байты
            byte[] buffer = Arrays.toString(array).getBytes();
            fos.write(buffer,0,buffer.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //чтение из файла
       try(FileInputStream fin = new FileInputStream("E://Java//Java_homework//Gvan6032//src//hw_9//task_1//note.txt")){
            System.out.printf("File size: %d bytes \n",fin.available());
            int i=-1;
            while ((i=fin.read())!=-1){
                System.out.printf(String.valueOf((char)i));
            }
        }
    }
}
