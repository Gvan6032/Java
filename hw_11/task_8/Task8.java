package hw_11.task_8;

import java.util.HashSet;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) {
        /*≈сть HashSet магазинов. ” магазина есть название и ID. —оздать несколько магазинов
        (через оператор new Shop(..))
        с одинаковым ID и названием и добавить их в ваш Set.
        ѕопробуйте разобратьс€ почему они все добавились,
        несмотр€ на то, что Set обеспечивает уникальность*/
        Set<Shop> shop = new HashSet<>();
        shop.add(new Shop(1, "Fruit"));
        shop.add(new Shop(2, "Table"));
        shop.add(new Shop(3, "Char"));
        System.out.println("Shop: ");
        System.out.printf(String.valueOf(shop));
    }
}
