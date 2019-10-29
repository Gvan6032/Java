package hw_7.task_7;

public class Task7 {
    public static void main(String[] args){

        // можно обойтись двумя переменными для всех замеров
        // int start; int stop;
        long finishString;
        long timeString;
        long startStringBuilder;
        long finishStringBuilder;
        long timeStringBuilder;
        long startStringBuffer;
        long finishStringBuffer;
        long timeStringBuffer;
        long startString = System.currentTimeMillis();

        // для выполнения этой задачи пригодится цикл, в котором будешь добавлять символ к строке и посмотришь сколько это займет времени
        // замерять время нужно будет перед циклом и после цикла.
        // и так для String, StringBuilder, StringBuffer
        String line = "I like sunshine. It's very important";
        line = line.substring(0,9);
        System.out.println(line);
        finishString = System.currentTimeMillis();
        startStringBuilder = System.currentTimeMillis();
       
        StringBuilder lineStringBuilder = new StringBuilder("I like sunshine. It's very important");
        lineStringBuilder = lineStringBuilder.reverse();
        System.out.println(lineStringBuilder);
        finishStringBuilder = System.currentTimeMillis();
        startStringBuffer = System.currentTimeMillis();
     
        StringBuffer lineStringBuffer = new StringBuffer("I like sunshine. It's very important");
        lineStringBuffer= lineStringBuffer.reverse();
        System.out.println(lineStringBuffer);
        finishStringBuffer = System.currentTimeMillis();
        timeString=finishString-startString;
        timeStringBuilder = finishStringBuilder-startStringBuilder;
        timeStringBuffer = finishStringBuffer-startStringBuffer;
        System.out.println("Lead time of String type: " + startString+" "+finishString+" "+timeString);
        System.out.println("Lead time of StringBuilder type: " + startStringBuilder+" "+finishStringBuilder+" "+timeStringBuilder);
        System.out.println("Lead time of StringBuffer type: " + startStringBuffer +" "+finishStringBuffer+" "+timeStringBuffer);
    }
}
