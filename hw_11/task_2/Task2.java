package hw_11.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
    /*Ñîçäàéòå öåëî÷èñëåííûé ArrayList. Çàïîëíèòå åãî 100 ýëåìåíòàìè, äîáàâëÿÿ êàæäûé íîâûé ýëåìåíò
    â íà÷àëî ñïèñêà è âûâåäèòå íà ýêðàí.
    Çàòåì óäàëèòå èç íåãî âñå ÷åòíûå ýëåìåíòû. È ñíîâà âûâåäèòå íà ýêðàí*/
        try {
            List<Integer> elements = new ArrayList<>();
            for (int i = 0; i <= 100; i++) {
                int randomElementTemp = (int) (Math.random() * 100);
                Integer randElement = randomElementTemp;
                elements.add(0, randElement);
            }
            System.out.println(elements);
            // удаление лучше вынести в отдельный метод
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
