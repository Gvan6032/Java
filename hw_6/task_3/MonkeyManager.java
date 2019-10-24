package hw_6.task_3;

public class MonkeyManager {
    private TreeBanana treeBanana;
    private TreeCoconut treeCoconut;

    public MonkeyManager(int count) {
        this.treeBanana = new TreeBanana();
        this.treeCoconut = new TreeCoconut();
    }

    public void countFruits(int count) {
        switch (count) {
            case 1:
                treeBanana.totalQuantityBanana();
                break;
            case 2:
                treeCoconut.totalQuantityCoconut();
                break;
            case 3:
                treeCoconut.totalQuantityCoconut();
                treeBanana.totalQuantityBanana();
                break;
        }
    }
}
