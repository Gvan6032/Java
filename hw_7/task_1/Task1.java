package hw_7.task_1;

// +
public class Task1 {
    public static void main (String [] args){
        /*Игра в слова. Есть строка “engineering”. Нужно выделить подстроку так,
        чтобы получилось два слова “engine” и “ring”.*/
        String line = "engineering";
        System.out.println(line.substring(0,6));
        System.out.println(line.substring(7,11));
    }
}
