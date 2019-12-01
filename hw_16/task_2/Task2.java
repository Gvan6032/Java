package hw_16.task_2;

public class Task2 {
    public static void main(String[] args) {
        /*Создать класс, который в цикле выводит на экран числа от 0-20 и в каждой итерации цикла засыпает на 1 секунду,
        запустить его экземпляр и запустить в отдельном потоке. Поток main должен дождаться окончания работы дочернего потока
        и затем вывести на экран сообщение о том, что главный поток завершен*/
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
