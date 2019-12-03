package hw_16.task_1;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*Ñîçäàòü êëàññ, êîòîðûé â öèêëå âûâîäèò íà ýêðàí ÷èñëà îò 0-10, çàïóñòèòü åãî â îòäåëüíîì ïîòîêå*/
        NmberThread countThread = new NmberThread("MyThread");
        countThread.start();
        // не стоит забывать про метод join()
    }
}
