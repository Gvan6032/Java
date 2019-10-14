package hw_3.task_7;

import java.util.Arrays;
import java.util.Scanner;

// старайся не оставлять комментарии в коде
public class Task7 {
    public static void main (String [] args)
    {
        /* Есть целочисленный неотсортированный массив. Отсортируйте его "пузырьком". */
        int size;
        System.out.println("Enter array size: ");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        int [] array = new int[size];
        boolean needToSort=true;
        for (int i=0; i< array.length;i++)
        {
            System.out.println("Enter array element: ");
            // Scanner inArray = new Scanner(System.in); один раз за пределами цикла
            Scanner inArray = new Scanner(System.in);
            array[i] = inArray.nextInt();
        }
        while(needToSort)//пока true
        {
            needToSort = false;//после окончания цикла for будет false ---прекращения цикла while
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    needToSort = true;
                }
            }
        }
        System.out.println("Array with sort: " + Arrays.toString(array));
    }
}
