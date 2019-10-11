package task_7;

public class Task7 {
    public static void main(String[] args) {
        // write your code here
        int sum=0;
        int i;
        for (i=1; i<=99;i++) {
            if(i%2!=0)
                sum +=i;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99: " + sum);
    }
}
