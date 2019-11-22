package hw_13.task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task5 {
    public static void main(String[] args) {
        /*(limit, reduce)
        Åñòü êîëëåêöèÿ ÷èñåë, íàéòè ïðîèçâåäåíèå ïåðâûõ 5òè ýëåìåíòîâ.*/
        List<Integer> line = new ArrayList<>();
        line.addAll(Arrays.asList(new Integer[]{1, 23, 34, 2, 3, 43, 4, 21, 8, 9, 43, 26}));
        System.out.println(line.toString());
        Optional<Integer> composition = line.stream()
                .limit(5)
                .reduce((x, y) -> x * y);
       // ты распечатаешь optional, который может быть пустым, добаврь проверку composition.isPresent()
        System.out.println(composition);
    }
}
