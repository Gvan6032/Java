package hw_5.task_2;

public class Warehouse {
    private final String [] array = new String[5];
    public Warehouse (){
        array [0] = "Wheat";//пшеница
        array [1] = "Rye";//рожь
        array [2] = "Colza";//рапс
        array [3] = "Oat";//овес
        array [4] = "Corn";//кукуруза
    }

    public void next(int next)
    {
        if (next == array.length-1)
        {
            System.out.println("Next array element: " + array[0].toString());
        }
        else
        {
            System.out.println("Next array elemebt: " + array[next].toString());
        }
    }

    public void getArray ()
    {
        for (int i=0; i< array.length; i++)
        {
            System.out.println(" Array: " + array[i].toString());
        }
    }
}
