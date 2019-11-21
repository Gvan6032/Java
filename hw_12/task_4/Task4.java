package hw_12.task_4;

import java.util.function.Supplier;

public class Task4 {
    public static void main(String[] args) {
        /*Ñîçäàòü êëàññ User, ñäåëàòü êîíñòðóêòîð ñ 1 ïàðàìåòðîì, íàïðèìåð, èìÿ.
       Ñîçäàòü ôóíêöèîíàëüíûé èíòåðôåéñ, ñ ìåòîäîì, êîòîðûé áû ñîçäàâàë þçåðà.
       Íàïèñàòü ëÿìáäà-âûðàæåíèå è ñîçäàòü þçåðà */
        
        // зачем здесь try-catch?
        try {
            String nameUser = "Anya";
            Supplier<User> userSupplier = () -> new User(nameUser);
            System.out.println(nameUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
