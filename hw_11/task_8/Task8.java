package hw_11.task_8;

import java.util.HashSet;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) {
        /*���� HashSet ���������. � �������� ���� �������� � ID. ������� ��������� ���������
        (����� �������� new Shop(..))
        � ���������� ID � ��������� � �������� �� � ��� Set.
        ���������� ����������� ������ ��� ��� ����������,
        �������� �� ��, ��� Set ������������ ������������*/
        Set<Shop> shop = new HashSet<>();
        shop.add(new Shop(1, "Fruit"));
        shop.add(new Shop(2, "Table"));
        shop.add(new Shop(3, "Char"));
        System.out.println("Shop: ");
        System.out.printf(String.valueOf(shop));
    }
}
