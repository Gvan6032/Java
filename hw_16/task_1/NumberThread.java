package hw_16.task_1;

class NmberThread extends Thread {

    NmberThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int count = 10;
        for (int i = 0; i <= count; i++) {
            System.out.println("Thread: " + super.getName() + " " + "count " + i);
        }
    }
}
