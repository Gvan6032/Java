package hw_12.task_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        /*При помощи лямбда выражения, написать свой компаратор, который бы сортировал лист строк в обратном порядке*/
        try {
            Comparator<String> comparator = (String lineFirst, String lineSecond) -> -lineFirst.compareTo(lineSecond);
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
