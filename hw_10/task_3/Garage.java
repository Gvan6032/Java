package hw_10.task_3;

import java.util.Arrays;

// +
public class Garage<T> {

    private T car;

    public Garage(T car) {
        this.car = car;
    }

    public Garage(T[] car) {
        this.car = (T) car;
    }

    public T getCar() {
        return car;
    }

    public T getCars(T[] car) {
        return (T) Arrays.toString(car);
    }
}
