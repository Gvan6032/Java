package hw_3.task_8;

import java.util.Scanner;

// отличная бабочка
public class Task8 {
    public static void main (String[] args) {
        int height;
        System.out.println("Enter height: ");
        Scanner in = new Scanner(System.in);
        height = in.nextInt();
        int width;
        System.out.println("Enter weight: ");
        width = in.nextInt();
        int count;
        // когда идет сложный код, лучше давать более понятные имена даже переменным из цикла
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i >= height / 2) {
                    count = height - i - 1;
                } else {
                    count = i;
                }
                if ((j <= count) || (j >= width - count - 1)) {
                    if (j >= width / 2) {
                        count = width - j;
                    } else {
                        count = j + 1;
                    }
                    System.out.print(count);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
