package hw_6.task_2;

public class Motor {
    private boolean state; //мотор работает

    public void switchOffTheEngine(boolean state) {
        if (state == true)//мотор работает
        {
            System.out.println("The engine was switched off");
            state = false;
        } else {
            System.out.println("The engine was switched before");
        }
    }

    public void startTheEngine(boolean state) {
        if (state = false) {
            System.out.println("The engine was started");
            state = true;
        } else {
            System.out.println("The engine was started before");
        }
    }
}
