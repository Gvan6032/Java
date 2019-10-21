package hw_5.task_3;

public class CountryHouse implements InterfaceHouse{

    int numberOfTenants;
    int numberOfFloors;
    String type;

    public CountryHouse ()
    {
        numberOfFloors = 2;
        numberOfTenants = 2;
        type = "Country house";
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
