package hw_3.task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
   public static void main (String[] args)
   {
       /*Есть массив чисел. Заменить каждый нечетный элемент массива на 0*/
       int size = 0;
       System.out.println("Enter array size: ");
       Scanner in = new Scanner(System.in);//получаем Input Stream
       size = in.nextInt();//считываем примитивные типы данных (int)
       int [] array = new int[size];//выделение памяти под массив
       for (int i =0; i< array.length; i++)
       {
           System.out.println("Enter array element: ");
           Scanner inArray = new Scanner(System.in);
           array[i] = inArray.nextInt();
           if (array[i]%2!=0)//проверка если остаток от деления не равен 0
           {
               array[i] = 0; //присваиваем значение элементу массива 0
           }
       }
       System.out.println("Array: " + Arrays.toString(array));//вывод всех элементов массива
   }
}
