package hw_12.task_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        /*Ïðè ïîìîùè ëÿìáäà âûðàæåíèÿ, íàïèñàòü ñâîé êîìïàðàòîð, êîòîðûé áû ñîðòèðîâàë ëèñò ñòðîê â îáðàòíîì ïîðÿäêå*/
        try {
            Comparator<String> comparator = (String lineFirst, String lineSecond) -> -lineFirst.compareTo(lineSecond);// -first.compareTo(second) -> -1 * first.compareTo(second) так лучше
            List<String> line = new ArrayList<>();
            line.add("Sun");
            line.add("is");
            line.add("shining");
            System.out.println(line);
            line.sort(comparator);
            System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
