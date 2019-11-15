package hw_10.task_3;

public class Task3 {
    public static void main(String[] args) {
        /*Åñòü 3 òèïà ãàðàæåé:
1. Ìîãóò õðàíèòüñÿ òîëüêî BMW
2. Ìîãóò õðàíèòüñÿ òîëüêî Lada
3. Ìîãóò õðàíèòüñÿ âñå àâòî
Ïðèäóìàéòå òàêîé êëàññ è ñîçäàéòå 3 òèïà ãàðàæåé, èñïîëüçóéòå generics*/
        BMW carBmw = new BMW("TR-2", "Red", "TURBO-9");
        Lada carLada = new Lada("Blue", "LADA Kalina", "TYR-78");
        Auto[] auto = new Auto[]{carBmw, carBmw, carLada};
        // Garage<Auto> -> Garage<BMW>
        Garage<Auto> garage1 = new Garage<Auto>(carBmw);
        // Garage<Auto> -> Garage<Lada>
        Garage<Auto> garage2 = new Garage<Auto>(carLada);
        Garage<Auto> garage3 = new Garage<>(auto);

        System.out.println(garage1.getCar());
        System.out.println(garage2.getCar());
        System.out.println(garage1.getCars(auto));
    }
}
