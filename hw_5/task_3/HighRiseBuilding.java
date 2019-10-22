package hw_5.task_3;

// форматируй код
public class HighRiseBuilding implements InterfaceHouse{

    int numberOfTenants;
    int numberOfFloors;
    String type;

    // лучше конструктор с аргументами
     public HighRiseBuilding()
     {
         numberOfFloors = 56;
         numberOfTenants = 34;
         type = "High-rise building";
     }

    @Override
    public void getNumberOfTenants()
    {
        System.out.println("Number of Tenants: " + numberOfTenants);
    }

    @Override
    public void getNumberOfFloors()
    {
        System.out.println("Number of Floors: "+ numberOfFloors);
    }

    @Override
    public void turnOnTheHeating()
    {
        System.out.println("Turn on the heating !");
    }

}
