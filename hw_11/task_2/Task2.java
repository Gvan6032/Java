package hw_11.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
    /*Создайте целочисленный ArrayList. Заполните его 100 элементами, добавляя каждый новый элемент
    в начало списка и выведите на экран.
    Затем удалите из него все четные элементы. И снова выведите на экран*/
        try {
            List<Integer> elements = new ArrayList<>();
            for (int i = 0; i <= 100; i++) {
                int randomElementTemp = (int) (Math.random() * 100);
                Integer randElement = randomElementTemp;
                elements.add(0, randElement);
            }
            System.out.println(elements);
            Iterator iterator = elements.iterator();
            while (iterator.hasNext()) {
                int temp = (int) iterator.next();
                if (temp % 2 == 0) {
                    iterator.remove();
                }
            }
            System.out.println(elements);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
