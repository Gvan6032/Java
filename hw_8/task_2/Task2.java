package hw_8.task_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Написать метод, который бы парсил строку в число, обработать исключение,
        которое может быть при неверном формате числа*/
        try {
            String line;
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter any number");
            line = in.next();
            int parse = Integer.parseInt(line);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
