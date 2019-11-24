package hw_14.task_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    /*������� ���� ��������� (���� Cat). ��������� ���� ���������� � null,
    ������������� ���� � ���� � ��������������� �� �����. ��������� ������� null ���������*/
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "E://Java//Java_homework//Gvan6032//src//hw_14//task_5//Cat.txt";
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Tommy"));
        cats.add(new Cat("Donny"));
        cats.add(new Cat("Sam"));
        serializableObject(path, cats);
        deserializableObject(path);
    }

    public static void serializableObject(String path, List<Cat> cats) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);//��� ������ ������ � ����
        ObjectOutputStream oos = new ObjectOutputStream(fos);//����������� ������� � �����

        oos.writeObject(cats);//��������� ������� � ����
        oos.close();//��������� �����  � ����������� �������
    }

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
