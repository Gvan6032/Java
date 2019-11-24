package hw_6.task_3;

public class TreeBanana {
    private int branchQuantity;
    private int branchBanana;

    public TreeBanana() {
        this.branchBanana = 10;//количество бананов на ветке
        this.branchQuantity = 25;//количество веток
    }

    public void countBranch(int quantity){
        int [] arrayBranch = new int[quantity];
        int [] arrayBranch2 = new int[quantity];
        //arrayBranch[quantity] ;
    }
    
    public void totalQuantityBanana() {
        int total = branchBanana * branchQuantity;
        System.out.println("Total quantity of bananas: " + total);
    }
}
