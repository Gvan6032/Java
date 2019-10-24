package hw_6.task_3;

public class TreeCoconut {
    private int branchQuantity;
    private int branchCoconut;

    public TreeCoconut() {
        this.branchCoconut = 14;//количество кокосов на ветке
        this.branchQuantity = 21;//количество веток на дереве
    }

    public void totalQuantityCoconut() {
        int total = branchCoconut * branchQuantity;
        System.out.println("Total quantity of coconut: " + total);
    }
}
