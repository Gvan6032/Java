package hw_9.task_4;

import java.io.*;

public class Task4 {
    public static void main (String[] args) {
        /*Создайте класс Employee, Work. У Work есть атрибуты название и минимальный стаж.
                У Employee есть имя, возраст и работа (work).
                Запишите объект Employee в файл, затем восстановите его обратно в объект.*/
        try {
            Employee employee = new Employee("Anya", 20);
            writeFile(employee);
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(Employee employee) throws IOException{
        // путь к файлу вынести в константу и передавать аргументом в метод
        FileOutputStream fos = new FileOutputStream("E://Java//Java_homework//Gvan6032//src//hw_9//task_4//note4.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
        oos.flush();; // ;; -> ;
        oos.close();
    }

    public static void readFile () throws IOException, ClassNotFoundException {
        // путь к файлу вынести в константу и передавать аргументом в метод
        FileInputStream fin = new FileInputStream("E://Java//Java_homework//Gvan6032//src//hw_9//task_4//note4.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        Employee employee = (Employee) oin.readObject();
        System.out.printf(String.valueOf(employee));
        // метод close не стоит забывать вызывать
    }
}
