package hw_12.task_4;

import java.util.function.Supplier;

public class Task4 {
    public static void main(String[] args) {
        /*������� ����� User, ������� ����������� � 1 ����������, ��������, ���.
       ������� �������������� ���������, � �������, ������� �� �������� �����.
       �������� ������-��������� � ������� ����� */
        try {
            String nameUser = "Anya";
            Supplier<User> userSupplier = () -> new User(nameUser);
            System.out.println(nameUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
