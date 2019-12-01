package hw_16.task_2;

public class Task2 {
    public static void main(String[] args) {
        /*������� �����, ������� � ����� ������� �� ����� ����� �� 0-20 � � ������ �������� ����� �������� �� 1 �������,
        ��������� ��� ��������� � ��������� � ��������� ������. ����� main ������ ��������� ��������� ������ ��������� ������
        � ����� ������� �� ����� ��������� � ���, ��� ������� ����� ��������*/
        System.out.println("Main thread started ...");
        NumberThread countThread = new NumberThread("MyThread");
        countThread.start();
        try {
            countThread.join();
        } catch (InterruptedException e) {
            System.out.printf("%s has been interrupted", countThread.getName());
        }
        System.out.println("Main thread finished...");
    }
}
