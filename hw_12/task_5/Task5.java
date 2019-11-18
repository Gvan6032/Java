package hw_12.task_5;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {
        /*Создать метод, который бы принимал на вход List<User> и предикат, по которому все юзеры,
        у которых имена начинаются с A,P,E удалялись бы из этого листа
        */
        try {
            List<hw_12.task_5.User> userList = new LinkedList<>();
            userList.add(new User("Nick"));
            userList.add(new User("Petsy"));
            userList.add(new User("Nastya"));
            userList.add(new User("Anya"));
            userList.add(new User("Eugen"));
            System.out.println(userList);
            Predicate<String> userPredicate = name -> name.startsWith("A") || name.startsWith("P") || name.startsWith("E");
            for (int i = 0; i < userList.size(); i++) {
                boolean state = userPredicate.test(userList.get(i).getName());
                System.out.println(state);
                if (state) {
                    userList.remove(i);
                    i--;
                }
            }
            System.out.println(userList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
