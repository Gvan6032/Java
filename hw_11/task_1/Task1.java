package hw_11.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Вход на вечеринку только по списку.
        Есть список имен (коллекция). Пользователь вводит с консоли свое имя,
        а программа проверяет его наличие в списке,
        после чего говорит может он пройти или нет*/
        try {
            List<String> names = new ArrayList<>(5);
            names.add("Helena");
            names.add("Anna");
            names.add("Georgetta");
            names.add("Alex");
            names.add("Denis");
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter your name: ");
            String checkName = in.nextLine();
            if (names.equals(checkName)) {
                System.out.println("You may go to the party");
            } else {
                System.out.println("You are not allowed go to the party");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
