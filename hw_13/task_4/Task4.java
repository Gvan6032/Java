package hw_13.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {
        /*(filter + findFirst)
         Åñòü êîëëåêöèÿ ÷èñåë, íàéòè ïåðâîå, êîòîðîå áóäåò áîëüøå 22.*/
        List<Integer> line = new ArrayList<>();
        line.addAll(Arrays.asList(new Integer[]{1, 23, 34, 2, 3, 43, 4, 21, 8, 9, 43, 26}));
        System.out.println(line.toString());
        Optional<Integer> lineStream = line.stream()
                .filter(lineInteger -> lineInteger > 22)
                .findFirst();
        // ты распечатаешь optional, который может быть пустым, добаврь проверку lineStream.isPresent()
        System.out.println(lineStream);
    }
}
