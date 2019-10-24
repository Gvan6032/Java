package hw_6.task_2;

public class Transmission {

    private int transmission;

    public Transmission(int transmission) {
        this.transmission = transmission;
    }

    public void shiftGearUp(int transmission) {
        if (transmission <= 7) {
            transmission++;
            System.out.println("Gear was shifted up");
        } else {
            System.out.println("Gear was shifted up before");
        }
    }

    public void lowerGear(int transmission) {
        if (transmission > 0 && transmission < 8) {
            transmission--;
            System.out.println("Gear was lowered");
        }
    }

    public int getGear() {
        return transmission;
    }
}
