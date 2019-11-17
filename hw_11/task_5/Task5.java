package hw_11.task_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        /*Åñòü ArrayList è LinkedList íà 100Ê îäèíàêîâûõ ýëåìåíòîâ.
        Íóæíî íàïèñàòü áåí÷ìàðê, êîòîðûé áû ïîêàçàë ñêîðîñòü óäàëåíèÿ èç ÑÅÐÅÄÈÍÛ ó äâóõ ýòèõ ëèñòîâ
        Óäàëèòü íóæíî âñå ýëåìåíòû*/
        try {
            // эти два цикла можно объеденить в один и лучше вынести в отдельный метод
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
           
            // удаление стоит вынести в отдельный метод
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
