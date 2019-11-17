package hw_11.task_10;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Task10 {
    public static void main(String[] args) {
        /*Есть неупорядоченный склад с фруктами (допустим это List<Fruits>). У фрукта есть название и кол-во в кг.
        Попробуйте в качестве учетного журнала использовать HashMap или TreeMap*/
        try {
            List<Fruits> fruits = new LinkedList<>();
            fruits.add(new Fruits("Orange", 34.12));
            fruits.add(new Fruits("Lemon", 54.23));
            fruits.add(new Fruits("Apple", 100.32));
            System.out.println(fruits);

            Map<String, Double> fruitsWeight = new HashMap<>();
            for (int i = 0; i < fruits.size(); i++) {
                if (fruitsWeight.containsKey(fruits.get(i).getName())) {
                    fruitsWeight.put(fruits.get(i).getName(), fruitsWeight.get(fruits.get(i).getName() + fruits.get(i).getWeight()));
                } else {
                    fruitsWeight.put(fruits.get(i).getName(), fruits.get(i).getWeight());
                }
            }
            System.out.println(fruitsWeight);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
