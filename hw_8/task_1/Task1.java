package hw_8.task_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        /*Создать метод, который бы делил одно число на другое, обработать исключение при делении на 0.
        И вывести пользователю сообщение о том, что на 0 делить нельзя*/
        double a;
        double b;
        double c;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number a: ");
        a = in.nextDouble();
        System.out.println("Please enter number b: ");
        b = in.nextDouble();
        try {
            c = a / b;
            if (b == 0) {
                throw new Exception("Division by zero is prohibited");
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Block finally");
        }
    }
}
