package hw_6.task_2;

public class Car {
    private boolean gaz;
    private Transmission transmission;
    private Motor motor;
    private int gear;

    public Car() {
        this.gaz = false;
        this.gear = 0;
        this.transmission = new Transmission(gear);
        this.motor = new Motor();
    }

    public void move() {
        motor.startTheEngine(true);
        transmission.shiftGearUp(0);
        pressTheGas(false);
    }

    public void pressTheGas(boolean gas) {
        if (gas == false) {
            System.out.println("The gas was pressed");
            gas = true;
        } else {
            System.out.println("The gas earlier was pressed");
        }
    }

    public void currentSpeed(int gear) {
        int speed;
        speed = gear * 20;
        System.out.println("Speed: " + speed);
    }
}
