package hw_11.task_11;

import java.util.TreeSet;

public class Task11 {
    public static void main(String[] args) {
        /*���� TreeSet ����, ���������� ������� ��� �� "H" �� "W" (regex (�������))*/
        TreeSet<String> namesTreSet = new TreeSet<>();
        namesTreSet.add("Nastya");
        namesTreSet.add("Halya");
        namesTreSet.add("Wanessa");
        namesTreSet.add("Freddy");
        namesTreSet.add("Bredley");

        System.out.println(namesTreSet);
        System.out.println(namesTreSet.subSet("H", "W"));
    }
}
