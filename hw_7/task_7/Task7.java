package hw_7.task_7;

public class Task7 {
    public static void main(String[] args){

        long finishString;
        long timeString;
        long startStringBuilder;
        long finishStringBuilder;
        long timeStringBuilder;
        long startStringBuffer;
        long finishStringBuffer;
        long timeStringBuffer;
        long startString = System.currentTimeMillis();

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
