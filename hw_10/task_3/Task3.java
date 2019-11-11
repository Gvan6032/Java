package hw_10.task_3;

public class Task3 {
    public static void main(String[] args) {
        /*Есть 3 типа гаражей:
1. Могут храниться только BMW
2. Могут храниться только Lada
3. Могут храниться все авто
Придумайте такой класс и создайте 3 типа гаражей, используйте generics*/
        BMW carBmw = new BMW("TR-2", "Red", "TURBO-9");
        Lada carLada = new Lada("Blue", "LADA Kalina", "TYR-78");
        Auto[] auto = new Auto[]{carBmw, carBmw, carLada};
        Garage<Auto> garage1 = new Garage<Auto>(carBmw);
        Garage<Auto> garage2 = new Garage<Auto>(carLada);
        Garage<Auto> garage3 = new Garage<>(auto);

        System.out.println(garage1.getCar());
        System.out.println(garage2.getCar());
        System.out.println(garage1.getCars(auto));
    }
}