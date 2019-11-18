package hw_12.task_4;

import java.util.function.Supplier;

public class Task4 {
    public static void main(String[] args) {
        /*Создать класс User, сделать конструктор с 1 параметром, например, имя.
       Создать функциональный интерфейс, с методом, который бы создавал юзера.
       Написать лямбда-выражение и создать юзера */
        try {
            String nameUser = "Anya";
            Supplier<User> userSupplier = () -> new User(nameUser);
            System.out.println(nameUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
