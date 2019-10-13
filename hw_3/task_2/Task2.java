package hw_3.task_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
        /*Есть массив чисел. Найти среднее арифметическое число элементов массива*/
        int size = 0;//размер массива
        double average =0;//среднее арифметическое массива --присвоили значение 0
        System.out.println("Enter array size:");
        Scanner in = new Scanner(System.in);//получаем Input Stream
        size = in.nextInt();//считываем примитивные типы данных (int)
        int [] array = new int[size]; //выделение памяти для массива
        for (int i=0; i< array.length; i++)
        {
            System.out.println("Enter array element: ");//введите элемент массива
            Scanner inArray = new Scanner(System.in);//получаем Input Stream
            array[i]= inArray.nextInt();//считываем примитивные типы данных (int)
            average +=array[i];//подсчет сумы элементов массива
        }
        average = average/size;//определение среднего арифметического массива
        System.out.println("Array average:" + average);
    }
}
