package hw_8.task_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Попросите пользователя ввести число размера будущего массива, но не больше размера Y (задайте сами).
        Если пользователь ввел число больше Y или отрицательное, то выбросьте собственное исключение и
        попросите пользователя ввести число заново.*/
        int number;
        // плохое название переменной
        int y = (int) (Math.random() * 20);
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        // int number = in.nextInt();
        number = in.nextInt();
        System.out.println("Y: " + y);
        try {
            if (number > y || y < 0) { // y < 0 я думаю должно быть number < 0
                throw new MyException("Please try again. The number is less than Y or negative: ", number);
            }
        } catch (Exception e) {
            e.printStackTrace(); // пользователь не должен видеть stack trace, можно e.getMessage() и распечатать сообщение с number
        }
    }
}
