package hw_16.task_1;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*Создать класс, который в цикле выводит на экран числа от 0-10, запустить его в отдельном потоке*/
        NmberThread countThread = new NmberThread("MyThread");
        countThread.start();
    }
}
