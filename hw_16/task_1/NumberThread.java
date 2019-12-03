package hw_16.task_1;

// опечатка в названии
class NmberThread extends Thread {

    NmberThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int count = 10;
        for (int i = 0; i <= count; i++) {
            // String.format() получше бы смотрелся
            System.out.println("Thread: " + super.getName() + " " + "count " + i);
        }
    }
}
