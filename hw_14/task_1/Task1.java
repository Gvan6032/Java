package hw_14.task_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Åñòü ïðèâåòñòâåííîå ïðåäëîæåíèå:
"Hello, my name is Alex. I'm java developer and I'm glad to become a part of your company."
Íåîáõîäèìî ñäåëàòü òàê, ÷òîáû ìîæíî áûëî ïîäñòàâèòü ëþáîå èìÿ è ÿçûê ïðîãðàììèðîâàíèÿ.
Íàïèøèòå ïðîãðàììó, êîòîðàÿ áû ïîçâîëÿëà ââîäèòü èìÿ è ÿçûê ïðîãðàììèðîâàíèÿ ñ êîíñîëè è çàòåì âûâîäèëà
íà ýêðàí ïîëó÷åííîå ñîîáùåíèå */
        System.out.println("Hello! Please enter your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("What programming language do you prefer? ");
        String language = in.next();
        // используй шаблон String.format() %s, %d
        System.out.println("Hello, my name is " + name + "." + " I'm " + language + " developer and I'm glad to became a part of your company.");
    }
}
