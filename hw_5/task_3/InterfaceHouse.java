package hw_5.task_3;

// InterfaceHouse -> House, слово Inerface не нужно
public interface InterfaceHouse {
//     default void getNumberOfTenants() {} -> void getNumberOfTenants(); и так со всеми остальными
    default void getNumberOfTenants() {}
    default void getNumberOfFloors() {}
    default void turnOnTheHeating () {}
    // default void getAddress (String address){}; -> void getAddress (String address);
    default void getAddress (String address){}; // ; не нужна
    default void getTypeInfo (String typeInfo){}; // ; не нужна
}
