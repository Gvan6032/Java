package hw_13.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        /*Есть коллекция телефонов, сделать из нее мапу, в которой ключ -
        это производитель, а вэлью - это кол-во телефонов этого производителя в исходной коллекции
         */
        List<Phone> phone = new ArrayList<>();
        phone.add(new Phone("Apple", 2019));
        phone.add(new Phone("Samsung", 2002));
        phone.add(new Phone("Apple", 2011));
        phone.add(new Phone("Samsung", 2000));
        phone.add(new Phone("ZTE", 2018));
        phone.add(new Phone("Huawei", 2015));
        Map<String, Long> phoneStream = phone.stream()
                .collect(Collectors.groupingBy(Phone::getManufacturer, Collectors.counting()));
        System.out.println(phoneStream);
    }
}
