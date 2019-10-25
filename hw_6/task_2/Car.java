package hw_6.task_2;

public class Car {
    private boolean gaz;
    private Transmission transmission;
    private Motor motor;
    private int gear;

    public Car() {
        // при создании объекта класса Car boolean поле 'gaz' будет инициализировано в false, поэтому самому можно не присваивать
        this.gaz = false;
       // при создании объекта класса Car int поле 'gear' будет инициализировано в 0, поэтому самому можно не присваивать
        this.gear = 0;
        // motor & transmission лучше передавать аргументом в конструктор
        this.transmission = new Transmission(gear);
        this.motor = new Motor();
    }

    public void move() {
        motor.startTheEngine(true);
        transmission.shiftGearUp(0);
        pressTheGas(false);
    }

    public void pressTheGas(boolean gas) {
        if (gas == false) { // gas == false -> if(!gas)
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
