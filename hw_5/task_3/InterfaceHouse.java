package hw_5.task_3;

public interface InterfaceHouse {

    default void getNumberOfTenants() {}
    default void getNumberOfFloors() {}
    default void turnOnTheHeating () {}
    default void getAddress (String address){};
    default void getTypeInfo (String typeInfo){};
}
