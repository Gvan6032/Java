package hw_8.task_4;

public class Washer {
    boolean powerSupply;// по умолчанию false

    public Washer(boolean powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void draining() {
        powerSupply = true;
        startWasher();
        System.out.println("Water drain is working. The washing machine was turned on");
    }

    public void startWasher() {
        try {
            if (powerSupply) {
                System.out.println("The washing machine is working...");
            }
            if (!powerSupply) {
                throw new PowerSupplyException("It is necessary to check the power supply!", powerSupply);
            }
        } catch (PowerSupplyException e) {
            e.printStackTrace();
        }
    }
}