package hw_8.task_3;

public class MyException extends Exception {
    private int number;

    public MyException(String message, int num) {
        super(message);
        number = num;
    }

    private int getNumber() {
        return number;
    }
}
