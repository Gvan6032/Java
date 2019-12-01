package hw_16.task_3;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        /*Есть магазин игрушек, в который несколько поставщиков (потоков) доставляют товар. Вам необходимо доставить в магазин игрушки
(например 100 от одного поставщика и 50 от другого и затем вывести на экран все игрушки, которые сейчас в магазине*/
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
