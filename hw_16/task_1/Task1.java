package hw_16.task_1;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*������� �����, ������� � ����� ������� �� ����� ����� �� 0-10, ��������� ��� � ��������� ������*/
        NmberThread countThread = new NmberThread("MyThread");
        countThread.start();
    }
}
