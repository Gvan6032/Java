package hw_12.task_3;

import java.util.function.BinaryOperator;

public class Task3 {
    public static void main(String[] args) {
        /*��������� ��������� BinaryOperator �������� ������-���������, ������� �� �������� ���� ����� ����� �� ������*/
        try {
            BinaryOperator<Integer> multiply = (x, y) -> x * y;
            System.out.println(multiply.apply(2, 5));
            System.out.println(multiply.apply(8, -9));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
