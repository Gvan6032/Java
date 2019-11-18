package hw_12.task_1;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        /*���� �����, ������� ��������� �� ����� ��������(������ ��� ����� ���������).
        ��� ���������� ������� ���� � �����, � ������� ����� �������� (�������� ��� ����������
        ��� � ���������, �.�. �����)*/
        try {
            List<Warehouse> productWarehouse = new LinkedList<>();
            productWarehouse.add(new Warehouse("Apple"));
            productWarehouse.add(new Warehouse("Orange"));
            timeProduct(productWarehouse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void timeProduct(List<Warehouse> productWarehouse) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }
}
