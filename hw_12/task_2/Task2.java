package hw_12.task_2;

public class Task2 {
    public static void main(String[] args) {
        /*�������� ������� �������� ����� � ������ � ����������� �������� �������. ��������, 5 -> 5 ������.*/
        try {
            Function<Integer, String> convert = number -> String.valueOf(number) + " rubles";
            System.out.println(convert.apply(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
