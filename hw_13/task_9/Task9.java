package hw_13.task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// а это точно таск 9?
public class Task9 {
    public static void main(String[] args) {
        /*Åñòü êîëëåêöèÿ òåëåôîíîâ. Íóæíî ðàçäåëèòü íà äâå ÷àñòè,
        â îäíîé òîëüêî àéôîíû, â äðóãîé îñòàëüíûå ïðîèçâîäèòåëè.
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
