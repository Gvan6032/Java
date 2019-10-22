package hw_5.task_1;

public interface Computer {

     // про использование дефолтных методов рассказал на лекции 6. В данном примере не стоит их использовать
     default void turnOn() {
        System.out.println("Turn on");
     }; // нужен абзац
     default void  switchOff(){
         System.out.println("Switch off");
     }; // нужен абзац
     default void reset(){
         System.out.println("Reset");
     };
}
