package hw_5.task_3;

import java.util.Scanner;

public class Task3 {
    public static void main (String [] args)
    {
        String type;
        CountryHouse countryHouse = new CountryHouse();
        HighRiseBuilding highRiseBuilding = new HighRiseBuilding();
        CatalogueOfHouses catalogueOfHouses = new CatalogueOfHouses();
        Scanner in = new Scanner(System.in);

        catalogueOfHouses.getArrayHouse();
        System.out.println("Please choose type of the house:");
        type = in.next();
        if (type == "Country house")
        {
            System.out.println("Number of floors: " + countryHouse.numberOfFloors);
            System.out.println("Number of tenants: " + countryHouse.numberOfTenants);
            countryHouse.turnOnTheHeating();
        }
        else
        {
            System.out.println("Number of floors: " + highRiseBuilding.numberOfFloors);
            System.out.println("Number of tenants: " + highRiseBuilding.numberOfTenants);
            highRiseBuilding.turnOnTheHeating();
        }
    }
}
