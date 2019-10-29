package hw_7.task_9;

// +
public class Task9 {
    public static void main(String[] args) {
        /*Есть массив строк, вывести на экран все строки, длина которых больше 5 символов*/
        String[] lineArray = new String[5];
        lineArray[0] = "The weather is fine";
        lineArray[1] = "The sun is shining";
        lineArray[2] = "Winter is coming...";
        lineArray[3] = "IQ";
        lineArray[4] = "QA";

        for (int i = 0; i < lineArray.length; i++) {
            if (lineArray[i].length() > 5) {
                System.out.println(lineArray[i]);
            }
        }
    }
}
