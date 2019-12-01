package hw_16.task_3;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        /*���� ������� �������, � ������� ��������� ����������� (�������) ���������� �����. ��� ���������� ��������� � ������� �������
(�������� 100 �� ������ ���������� � 50 �� ������� � ����� ������� �� ����� ��� �������, ������� ������ � ��������*/
        ToysStore toysStore = new ToysStore();
        int iter = 100;
        Runnable runnableFirst = () -> {
            for (int i = 0; i < iter; i++) {
                toysStore.putToy();
            }
        };

        Runnable runnableSecond = () -> {
            for (int i = 0; i < iter / 2; i++) {
                toysStore.putToy();
            }
        };

        Thread firstSuppliers = new Thread(runnableFirst);
        Thread secondSuppliers = new Thread(runnableSecond);

        firstSuppliers.start();
        ;
        secondSuppliers.start();

        firstSuppliers.join();
        secondSuppliers.join();

        System.out.println("Number of toys: " + toysStore.getNumberOfToys());
    }
}
