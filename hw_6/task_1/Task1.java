package hw_6.task_1;

public class Task1 {

    public static void main(String[] args) {
        /*Написать рекурсивную функцию, которая бы перебирала все элементы массива и выводила их на экран*/
        int n = 8;//(int) (Math.random() * 11); //генерирует массив случайными числами от 0 до 10
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.println(array[i]);
        }
        printArray(array, n);
    }

    public static void printArray(int[] array, int size) {
        if (size >= 0) {
            System.out.println("Array element: " + array[size - 1]);
            printArray(array, size - 1);
        }
    }
}
