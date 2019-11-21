package hw_13.task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        /*Есть коллекция телефонов. Нужно разделить на две части,
        в одной только айфоны, в другой остальные производители.
        */
        List<Phone> phone = new ArrayList<>();
        phone.add(new Phone("Apple", 2019));
        phone.add(new Phone("Samsung", 2002));
        phone.add(new Phone("Apple", 2011));
        phone.add(new Phone("Samsung", 2000));
        phone.add(new Phone("ZTE", 2018));
        phone.add(new Phone("Huawei", 2015));
        Map<String, List<Phone>> phoneStream = phone.stream()
                .collect(Collectors.groupingBy(Phone::getManufacturer, Collectors.toList()));
        System.out.println(phoneStream);
    }
}
