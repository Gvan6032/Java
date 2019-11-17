package hw_11.task_7;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

// +
public class Task7 {
    public static void main(String[] args) {
        /*Åñòü TreeSet ÷èñåë, íóæíî îòñîðòèðîâàòü åãî â îáðàòíîì ïîðÿäêå*/
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 1; i < treeSet.size(); i++) {
            treeSet.add((int) (Math.random() * treeSet.size()));
        }
        System.out.println("TreeSet: ");
        System.out.println(treeSet);
        Set<Integer> reversedTreeSet = new TreeSet<>(Collections.reverseOrder());
        reversedTreeSet.addAll(treeSet);
        System.out.println("TreeSet reversed: ");
        System.out.println(reversedTreeSet);
    }
}
