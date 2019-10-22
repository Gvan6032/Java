package hw_5.task_2;

// форматируй код
public class Warehouse {
    private final String [] array = new String[5]; // нужен абзац
    public Warehouse (){ // массив лучше передавать аргументом в конструкторе, а создавать в методе main()
        array [0] = "Wheat";//пшеница
        array [1] = "Rye";//рожь
        array [2] = "Colza";//рапс
        array [3] = "Oat";//овес
        array [4] = "Corn";//кукуруза
    }

    // лучше чтобы метод возвращал int, который затем можно было распечатать в методе main
    // метод next() не должен принимать аргументов, а внутри класса Warehouse заведи поле-курсор, которое знает текущий индекс массива
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

    // метод, который начинается со слова 'get' должен что-то возвращать, а не быть void, в данном случае возращать массив строк
    public void getArray ()
    {
        for (int i=0; i< array.length; i++)
        {
            System.out.println(" Array: " + array[i].toString());
        }
    }
}
