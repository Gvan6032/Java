package hw_11.task_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        /*Есть ArrayList и LinkedList на 100К одинаковых элементов.
        Нужно написать бенчмарк, который бы показал скорость удаления из НАЧАЛА у двух этих листов
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
                arrayList.remove(0);
            }
            long finish = System.currentTimeMillis();
            long time = finish - start;
            System.out.println("Start: " + start + "Finish: " + finish + "Time: " + time);
            start = System.currentTimeMillis();
            for (int i = 0; i < linkedList.size(); i++) {
                linkedList.remove(0);
            }
            finish = System.currentTimeMillis();
            time = finish - start;
            System.out.println("Start: " + start + "Finish: " + finish + "Time: " + time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
