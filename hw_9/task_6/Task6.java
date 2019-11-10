package hw_9.task_6;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class Task6 {
    public static void main (String [] args){
        /*Ñåêðåòíûé ôàéë. Ñêà÷àéòå ëþáóþ êàðòèíêó è çàïèøèòå â íåå ñåêðåòíîå ñîîáùåíèå, íå çàáóäüòå ïîñòàâèòü append flag â çíà÷åíèå true.
Çàòåì ýòî ñîîáùåíèå íóæíî ïðî÷èòàòü èç ôàéëà è âûâåñòè íà ýêðàí*/
        try {
            String secret;
            Scanner in = new Scanner(System.in);
            System.out.printf("Please enter secret phrase: ");
            secret=in.next(); // String secret = in.next();
            writeFile(secret);
            readFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writeFile (String secret) throws FileNotFoundException {
        //путь к файлу в константу и передавай в метод через аргумент
        try(FileOutputStream fos = new FileOutputStream("E://Java//Java_homework//Gvan6032//src//hw_9//task_6//krasnajaPanda.jpg",true)) {
            fos.write(secret.getBytes());
            fos.flush();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } // между методами должен быть абзац
    public static void readFile () throws FileNotFoundException {
                //путь к файлу в константу и передавай в метод через аргумент
        try(BufferedReader br = new BufferedReader(new FileReader("E://Java//Java_homework//Gvan6032//src//hw_9//task_6//krasnajaPanda.jpg"))){
            String secret = "";
            // ты прочитала весь файл и только в конце получила нужную строку. 
            // нужно было запомнить с какого момента читать из файла и прочитать только нужный кусок.
            // если в твой файл дописать еще что-нибудь, то секретное сообщение уже не будет в конце
            while ((secret = br.readLine())!= null) {
                System.out.printf("Secret phrase: " + secret);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
