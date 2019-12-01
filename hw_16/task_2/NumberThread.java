package hw_16.task_2;

public class NumberThread extends Thread {
    NumberThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int count = 20;
        for (int i = 0; i <= count; i++) {
            System.out.println("Thread: " + super.getName() + " " + "count " + i);
        }
        try {
            sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
