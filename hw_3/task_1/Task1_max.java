package hw_3.task_1;

import java.util.Arrays;
import java.util.Scanner;

// форматируй код
// старайся не оставлять комментарии
public class Task1_max {
    public static void main (String [] args) {
            /*Создать массив из 3 элементов. При помощи класса сканер и пользователя заполнить его. Вывести сумму,
            наименьшее и наибольшее из чисел на экран*/
        int [] array  = new int [3];
        //Integer [] arrayNew = new Integer[10];
        int sum=0; //Сумма
        for (int i=0; i< array.length; i++) {
            System.out.print("Введите элемент массива:");
            Scanner in = new Scanner(System.in); // эту строку за пределы цикла, не нужно каждый раз создавать сканнер, просто вызывай метод
            array[i] = in.nextInt();
            sum += array[i];//подсчет суммы элементов массива
        }
        System.out.println(Arrays.toString(array));//вывод всех элементов массива
        int min = array[0]; //присвоим значение min первому элементу массива
        int max = array[0]; //присвоим значение max первому элементу массива
        for (int j =0; j<array.length; j++)
        {
            if (array[j]>max)//определение наибольшего значения
            {
                max = array[j];
            }
            if (array[j] < min)//определение наименьшего значения
            {
                min = array[j];
            }
        }
        System.out.print ("Минимальное значение =" + min);
        System.out.print ("Максимальное значение =" + max);
        System.out.print("Сумма: " + sum);
    }
}
