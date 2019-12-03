package hw_16.task_3;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        /*Åñòü ìàãàçèí èãðóøåê, â êîòîðûé íåñêîëüêî ïîñòàâùèêîâ (ïîòîêîâ) äîñòàâëÿþò òîâàð. Âàì íåîáõîäèìî äîñòàâèòü â ìàãàçèí èãðóøêè
(íàïðèìåð 100 îò îäíîãî ïîñòàâùèêà è 50 îò äðóãîãî è çàòåì âûâåñòè íà ýêðàí âñå èãðóøêè, êîòîðûå ñåé÷àñ â ìàãàçèíå*/
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

        // firstSuppliers -> firstSupplier
        Thread firstSuppliers = new Thread(runnableFirst);
        // secondSuppliers -> secondSupplier
        Thread secondSuppliers = new Thread(runnableSecond);

        firstSuppliers.start();
        ; // это зачем?
        secondSuppliers.start();

        firstSuppliers.join();
        secondSuppliers.join();

        System.out.println("Number of toys: " + toysStore.getNumberOfToys());
    }
}
