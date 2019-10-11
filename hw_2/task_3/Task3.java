package task_3;

public class Task3 {
    public static void main(String[] args) {
        // write your code here
        double sum = 0;
        for (int i=0; i<= 8; i++) {
            sum = sum + Math.pow(2, i);
        }
        System.out.println("Сумма =" + sum);
    }
}
