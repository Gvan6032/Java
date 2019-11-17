package hw_11.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Âõîä íà âå÷åðèíêó òîëüêî ïî ñïèñêó.
        Åñòü ñïèñîê èìåí (êîëëåêöèÿ). Ïîëüçîâàòåëü ââîäèò ñ êîíñîëè ñâîå èìÿ,
        à ïðîãðàììà ïðîâåðÿåò åãî íàëè÷èå â ñïèñêå,
        ïîñëå ÷åãî ãîâîðèò ìîæåò îí ïðîéòè èëè íåò*/
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
            // names.contains(checkName);
            // не уверен что ты проверяла работу программы, т.к. она работает некорректно
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
