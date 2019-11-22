package hw_13.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// +
public class Task10 {
    public static void main(String[] args) {
        /*Åñòü êîëëåêöèÿ òåëåôîíîâ, ñäåëàòü èç íåå ìàïó, â êîòîðîé êëþ÷ -
        ýòî ïðîèçâîäèòåëü, à âýëüþ - ýòî êîë-âî òåëåôîíîâ ýòîãî ïðîèçâîäèòåëÿ â èñõîäíîé êîëëåêöèè
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
