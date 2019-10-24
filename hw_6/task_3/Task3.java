package hw_6.task_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int count = 0;
        MonkeyManager monkeyManager = new MonkeyManager(count);
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose the number: 1 | 2 |3 :");
        count = in.nextInt();
        monkeyManager.countFruits(count);
    }
}
