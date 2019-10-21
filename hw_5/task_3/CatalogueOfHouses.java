package hw_5.task_3;

public class CatalogueOfHouses {
    private String [] arrayHouse = new String [2];

    public CatalogueOfHouses()
    {
        arrayHouse[0] = "Country house";
        arrayHouse[1] = "High-rise building";
    }
    public void getArrayHouse() {
        for (int i=0; i< arrayHouse.length; i ++)
        {
            System.out.println("Type of houses: " + arrayHouse[i].toString());
        }
    }
}
