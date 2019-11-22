package hw_13.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// +
public class Task1 {
    public static void main(String[] args) {
        /*Åñòü êîëëåêöèÿ ñòðîê, íóæíî óáðàòü âñå ýëåìåíòû, äëèíà êîòîðûõ ìåíüøå 5 ñèìâîëîâ*/
        List<String> line = new ArrayList<>();
        line.add("Blue");
        line.add("Red ball");
        line.add("Green grass");
        List<String> list = line.stream()
                .filter(lineString -> lineString.length() > 5)
                .collect(Collectors.toList());
        System.out.println("String : " + list);
    }
}
