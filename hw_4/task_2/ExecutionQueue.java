package hw_4.task_2;

public class ExecutionQueue {
    private static String msg;

    static {
        msg = "static block";
    } // здесь нужен абзац
    {
        msg = "regular init block";
    } // здесь нужен абзац
    public ExecutionQueue ()
    {
        msg = "constructor value";
    }

    public String getMsg ()
    {
        return msg;
    }

}
