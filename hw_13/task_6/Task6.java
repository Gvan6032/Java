package hw_13.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        /*Task 6 (distinct)
        Есть коллекция телефонов, нужно убрать все повторяющиеся*/
        List<Phone> phone = new ArrayList<>();
        phone.add(new Phone("ZTE-654"));
        phone.add(new Phone("Apple SX 11 Pro"));
        phone.add(new Phone("Xiaomi P250"));
        phone.add(new Phone("Apple SX 11 Pro"));
        phone.add(new Phone("Xiaomi P250"));
        List<Phone> phoneDistinct = phone.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(phoneDistinct);
    }
}
