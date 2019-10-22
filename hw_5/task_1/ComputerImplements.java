package hw_5.task_1;

// форматируй код
    public class ComputerImplements implements Computer {

        @Override
        public void turnOn()
        {
            System.out.println("Turn on");
        }

        @Override
        public void switchOff (){
            System.out.println("Switch off");
        }

        @Override
        public void reset(){
            System.out.println("Reset");
        }
}
