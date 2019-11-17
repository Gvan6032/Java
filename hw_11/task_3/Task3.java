package hw_11.task_3;

import java.util.LinkedList;
import java.util.List;

// +
public class Task3 {
    public static void main(String[] args) {
        /*Åñòü äâå êîëëåêöèè, íóæíî óäàëèòü èç ïåðâîé òå, êîòîðûå åñòü âî âòîðîé*/
        try {
            List<String> elements = new LinkedList<>();
            elements.add("Hurts");
            elements.add("Placebo");
            elements.add("Blink182");
            elements.add("Bob Marley");
            System.out.println(elements);
            
            List<String> elementsEquals = new LinkedList<>();
            elementsEquals.add("Hurts");
            elementsEquals.add("Blink182");
            System.out.println(elementsEquals);
            
            elements.removeAll(elementsEquals);
            
            System.out.println(elements);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
