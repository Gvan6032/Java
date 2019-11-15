package hw_11.task_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        /*Есть ArrayList и LinkedList на 100К одинаковых элементов.
        Нужно написать бенчмарк, который бы показал скорость удаления из СЕРЕДИНЫ у двух этих листов
        Удалить нужно все элементы*/
        try {
            List<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                int temp = (int) (Math.random() * 20);
                Integer arList = temp;
                arrayList.add(i, arList);
            }
            List<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < 7; i++) {
                int temp = (int) (Math.random() * 20);
                Integer liList = temp;
                linkedList.add(i, liList);
            }
            long start = System.currentTimeMillis();
            for (int i = 0; i < arrayList.size(); i++) {
                int midArrayList = Math.round(arrayList.size() / 2);
                arrayList.remove(midArrayList);
            }
            long finish = System.currentTimeMillis();
            long time = finish - start;
            System.out.println("Start: " + start + "Finish: " + finish + "Time: " + time);
            start = System.currentTimeMillis();
            for (int i = 0; i < linkedList.size(); i++) {
                int midlinkedList = Math.round(linkedList.size() / 2);
                linkedList.remove(midlinkedList);
            }
            finish = System.currentTimeMillis();
            time = finish - start;
            System.out.println("Start: " + start + "Finish: " + finish + "Time: " + time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
