package hw_13.task_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        /*Есть коллекция телефонов, нужно сгруппировать по компании и вывести на экран*/
        List<Phone> phone = new ArrayList<>();
        phone.add(new Phone("Apple"));
        phone.add(new Phone("Samsung"));
        phone.add(new Phone("ZTE"));
        phone.add(new Phone("Apple"));
        phone.add(new Phone("ZTE"));
        phone.add(new Phone("Samsung"));
        Map<String, List<Phone>> phoneStream = phone.stream()
                .collect(Collectors.groupingBy(Phone::getManufacturer));
        System.out.println(phoneStream);
    }
}
