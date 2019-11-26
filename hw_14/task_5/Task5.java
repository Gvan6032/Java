package hw_14.task_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    /*Ñîçäàòü ëèñò ýëåìåíòîâ (òèïà Cat). Çàïîëíèòü ëèñò ýëåìåíòàìè è null,
    ñåðèàëèçîâàòü ëèñò â ôàéë è äåñåðèàëèçîâàòü èç ôàéëà. ïðîâåðèòü íàëè÷èå null ýëåìåíòîâ*/
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "E://Java//Java_homework//Gvan6032//src//hw_14//task_5//Cat.txt";
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Tommy"));
        cats.add(new Cat("Donny"));
        cats.add(new Cat("Sam"));
//        cats.add(null); - в этом суть задания
        serializableObject(path, cats);
        deserializableObject(path);
    }

    public static void serializableObject(String path, List<Cat> cats) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);//äëÿ çàïèñè äàííûõ â ôàéë
        ObjectOutputStream oos = new ObjectOutputStream(fos);//ïðåîáðàçóåò îáúåêòû â áàéòû

        oos.writeObject(cats);//ñîõðàíÿåì îáúåêòû â ôàéë
        oos.close();//çàêðûâàåì ïîòîê  è îñâîáîæäàåì ðåñóðñû
    }

    // <cats> - это зачем?
    // throws IOException, ClassNotFoundException - у тебя есть блок catch  с этим исключения, throws надо убрать
    public static <cats> void deserializableObject(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            List<Cat> cats = (List<Cat>) ois.readObject();
            System.out.println(cats);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
