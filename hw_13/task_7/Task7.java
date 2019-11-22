package hw_13.task_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// +
public class Task7 {
    public static void main(String[] args) {
        /*Åñòü êîëëåêöèÿ òåëåôîíîâ. Íàéòè òåëåôîí ñ íàèìåíüøåé öåíîé*/
        List<Phone> phone = new ArrayList<>();
        phone.add(new Phone(56.32));
        phone.add(new Phone(65.21));
        phone.add(new Phone(12.65));
        phone.add(new Phone(34.11));
       
        Optional<Phone> phoneMin = phone.stream()
                .min(Comparator.comparing(Phone::getPrice));
       
        phoneMin.ifPresentOrElse(
                v -> System.out.println(v),
                () -> System.out.println("Valur not found")
        );
    }
}
