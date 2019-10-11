package task_5;

public class Task5 {
    public static void main(String[] args) {
    // write your code here
       float sm =0;
       int dm;
       for (dm=1; dm<=20;dm++) {
         sm = (float) (dm * 0.24);
         System.out.println("Перевод от 1 до 20 дюймов в см: " + dm + " дюйм " + sm + " см");
       }
    }
}
