package hw_5.task_2;

import java.util.Scanner;

// когда изменишь класс Warehouse здесь тоже произойдут изменения
public class Task2 {
    public static void main (String [] args)
    {
        Warehouse product = new Warehouse();
        int next;

        product.getArray();
        System.out.println("Please enter the number of array elements: ");
        Scanner in = new Scanner(System.in);
        next = in.nextInt();
        product.next(next);
    }
}
