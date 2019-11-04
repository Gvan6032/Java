package hw_9.task_6;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class Task6 {
    public static void main (String [] args){
        /*Секретный файл. Скачайте любую картинку и запишите в нее секретное сообщение, не забудьте поставить append flag в значение true.
Затем это сообщение нужно прочитать из файла и вывести на экран*/
        try {
            String secret;
            Scanner in = new Scanner(System.in);
            System.out.printf("Please enter secret phrase: ");
            secret=in.next();
            writeFile(secret);
            readFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writeFile (String secret) throws FileNotFoundException {
        try(FileOutputStream fos = new FileOutputStream("E://Java//Java_homework//Gvan6032//src//hw_9//task_6//krasnajaPanda.jpg",true)) {
            fos.write(secret.getBytes());
            fos.flush();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void readFile () throws FileNotFoundException {
        try(BufferedReader br = new BufferedReader(new FileReader("E://Java//Java_homework//Gvan6032//src//hw_9//task_6//krasnajaPanda.jpg"))){
            String secret = "";
            while ((secret = br.readLine())!= null) {
                System.out.printf("Secret phrase: " + secret);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
