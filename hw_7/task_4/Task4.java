package hw_7.task_4;

import java.util.Arrays;

// форматируй код
// необходимо было посчитать повторение каждого из слов по отдельности, а не всех вместе
public class Task4 {
    public static void main (String [] args){
        boolean state;
        int count = 0;
        String line = "While major gameplay components are already in place and functioning,\n" +
                "\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        String [] split = line.split(" ");
        Arrays.toString(split);
        for (int i =0; i<split.length;i++) {
            state = Arrays.asList(split[i]).contains("alert");
            // if (state)
            if (state == true) {
                count++;
            }
            state = Arrays.asList(split[i]).contains("add");
            // if (state)
            if (state == true) {
                count++;
            }
            state = Arrays.asList(split[i]).contains("good");
            // if (state)
            if (state == true) {
                count++;
            }
            state = Arrays.asList(split[i]).contains("plan");
            // if (state)
            if (state == true) {
                count++;
            }
        }
        System.out.println("Number of repetitions: " + count);
    }
}
