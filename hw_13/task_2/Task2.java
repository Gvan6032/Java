package hw_13.task_2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        /*(max, String::compareTo / Comparator.naturalOrder())
         Åñòü êîëëåêöèÿ ñòðîê, íóæíî íàéòè ñòðîêó ñ ìàêñèìàëüíîé äëèííîé.*/
        List<String> line = new ArrayList<>();
        line.addAll(Arrays.asList(new String[]{"I", "Run", "Faster"}));
        System.out.println(line);
        String max = line.stream()
                .max(String::compareTo).get();

        // у тебя компаратор по алфавита сравнивает, а не по длине
        Optional<String> maxNew = line.stream().max(Comparator.naturalOrder());
        System.out.println(maxNew);
        maxNew.ifPresentOrElse(
                v -> System.out.println(v),
                () -> System.out.println("Value not found")
        );
    }
}
