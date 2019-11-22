package hw_13.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        /*Åñòü êîëëåêöèÿ òåëåôîíîâ. Íåîáõîäèìî ïîëó÷èòü èç íåå êîëëåêöèþ ïðîèçâîäèòåëåé (ïðîèçâîäèòåëü - ýòî ñòðîêà)
        è îñòàâèòü òîëüêî òå, êîòîðûå âõîäÿò â ñïèñîê:
        Apple, Samsung, Xiaomi*/
        List<Phone> phone = new ArrayList<>();
        phone.add(new Phone("Apple"));
        phone.add(new Phone("Huawei"));
        phone.add(new Phone("Nokia"));
        phone.add(new Phone("Samsung"));
        phone.add(new Phone("Xiaomi"));
        System.out.println(phone);
        List<String> phonePhone = phone.stream()
                .map(Phone::getManufacturer)
                     // лучше сделать коллекцию из этих слов и вызывать у этой коллекции contains()
                .filter(phoneString -> phoneString.contains("Apple") || phoneString.contains("Samsung") || phoneString.contains("Xiaomi"))
                .collect(Collectors.toList());
        System.out.println(phonePhone);
    }
}
