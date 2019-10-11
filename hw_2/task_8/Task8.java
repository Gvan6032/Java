package task_8;

public class Task8 {
    public static void main(String[] args) {
        // write your code here
        int sumAll=0;
        int sumEven=0;
        int sumOdd=0;
        for (int i=0; i<=100; i++){
            if(i%2==0)
                sumEven+=i;
            else
                sumOdd +=i;
            sumAll +=i;
        }
        System.out.println("Сумма четных чисел: " +sumEven+"Сумма нечетных чисел: " + sumOdd + "Сумма всех чисел: " +sumAll);
    }
}
