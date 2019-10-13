package hw_3.task_6;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main (String [] args) {
     /*Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого*/
        int size;//размер массива
        System.out.println("Enter array size: ");
        Scanner in = new  Scanner (System.in);
        size = in.nextInt();
        int [] array = new int[size];
        int amountEven =0;
        for(int i=0; i< array.length; i ++)
        {
            System.out.println("Enter array elements: ");
            Scanner inArray = new Scanner(System.in);
            array[i] = inArray.nextInt();
            if (array[i]%2 ==0)
            {
                amountEven ++;
            }
        }
        int [] arrayNew = new int[amountEven];
        int count=0;
        for(int i=0; i< array.length; i++)
        {
            if (array[i]%2==0)
            {
                arrayNew[count] = array[i];
                count ++;
            }
        }
        System.out.println("New array: " + Arrays.toString(arrayNew));
    }
}
