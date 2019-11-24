package hw_14.task_3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        /*≈сть две HashMap<String, List<Integer>>, нужно сделать из них одну (смержить)*/
        Map<String, List<Integer>> mapFirst = new HashMap<>();
        List<Integer> listFirst = new ArrayList<>();
        listFirst.add(1);
        listFirst.add(2);
        listFirst.add(3);
        listFirst.add(7);
        Map<String, List<Integer>> mapSecond = new HashMap<>();
        List<Integer> listSecond = new ArrayList<>();
        listSecond.add(4);
        listSecond.add(5);
        listSecond.add(6);
        listSecond.add(8);
        listSecond.add(9);
        mapFirst.put("First", listFirst);
        System.out.println(mapFirst);
        mapSecond.put("Second", listSecond);
        System.out.println(mapSecond);

        Map<String, List<Integer>> mapThierd = new HashMap<>(mapFirst);
        for (int i = 0; i < mapSecond.size(); i++) {
            int finalI = i;
            mapSecond.forEach((key, value) -> mapThierd.merge(key, value, (v1, v2) -> Collections.singletonList(v1.get(finalI) + v2.get(finalI))));
        }
        System.out.println(mapThierd);
    }
}