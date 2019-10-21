package hw_5.task_1;

public interface Computer {

     default void turnOn() {
        System.out.println("Turn on");
     };
     default void  switchOff(){
         System.out.println("Switch off");
     };
     default void reset(){
         System.out.println("Reset");
     };
}
