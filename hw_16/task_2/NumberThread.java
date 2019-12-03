package hw_16.task_2;

public class NumberThread extends Thread {
    NumberThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int count = 20; // лучше передавать через констуктор
        for (int i = 0; i <= count; i++) {
            System.out.println("Thread: " + super.getName() + " " + "count " + i);
        }
        try {
            sleep(1); // метод sleep() принимает время в миллисекундах, получается поток у тебя спит 1 миллисекунду, а надо секунду
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
