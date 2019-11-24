package hw_14.task_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Есть приветственное предложение:
"Hello, my name is Alex. I'm java developer and I'm glad to become a part of your company."
Необходимо сделать так, чтобы можно было подставить любое имя и язык программирования.
Напишите программу, которая бы позволяла вводить имя и язык программирования с консоли и затем выводила
на экран полученное сообщение */
        System.out.println("Hello! Please enter your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("What programming language do you prefer? ");
        String language = in.next();
        System.out.println("Hello, my name is " + name + "." + " I'm " + language + " developer and I'm glad to became a part of your company.");
    }
}
