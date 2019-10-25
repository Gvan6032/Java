package hw_6.task_2;

public class Motor {
    private boolean state; //мотор работает

    // я бы в метод 'switchOffTheEngine' не передавал аргументов, у нас есть поле класса 'state' которое знает о текущем состоянии двигателя  
    public void switchOffTheEngine(boolean state) {
        if (state == true)//мотор работает
        {
            System.out.println("The engine was switched off");
            state = false;
        } else {
            System.out.println("The engine was switched before");
        }
    }

    // я бы в метод 'startTheEngine' не передавал аргументов, у нас есть поле класса 'state' которое знает о текущем состоянии двигателя
    public void startTheEngine(boolean state) {
        // = это присвоить значение, == это сравнить
        if (state = false) { // state == false -> if (!state)
            System.out.println("The engine was started");
            // state = true; - ты меняешь значение аргумента метода, а не поля класса, т.к. имена совпадают стоит писать
            // this.state = true;
            state = true; 
        } else {
            System.out.println("The engine was started before");
        }
    }
}
