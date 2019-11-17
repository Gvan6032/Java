package hw_11.task_9;

import java.util.Set;
import java.util.TreeSet;

public class Task9 {
    public static void main(String[] args) {
        /*Есть TreeSet<Student>. Заполните его списком студентов. Если
        получили исключение, вспомните про интерфейс Comparable или Comparator
         */
        Set<Student> student = new TreeSet<>();
        student.add(new Student("Tanya", 19, "DFR-4"));
        student.add(new Student("Anya", 19, "DFK-5"));
        student.add(new Student("Fredy", 20, "DFR-5"));
        System.out.println(student);
    }
}
