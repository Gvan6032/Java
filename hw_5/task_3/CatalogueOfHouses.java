package hw_5.task_3;

public class CatalogueOfHouses {
    // private House[] houses;
    private String [] arrayHouse = new String [2];

    // передавай массив аргументом конструктора
    public CatalogueOfHouses()
    {
        arrayHouse[0] = "Country house";
        arrayHouse[1] = "High-rise building";
    } // нужен абзац
    public void getArrayHouse() { // метод getArray должен возвращать массив, а не печатать его, для печати хорошо использовать метод toString()
        for (int i=0; i< arrayHouse.length; i ++)
        {
            System.out.println("Type of houses: " + arrayHouse[i].toString());
        }
    }
}
