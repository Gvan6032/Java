package hw_10.task_3;

public class Task3 {
    public static void main(String[] args) {
        /*���� 3 ���� �������:
1. ����� ��������� ������ BMW
2. ����� ��������� ������ Lada
3. ����� ��������� ��� ����
���������� ����� ����� � �������� 3 ���� �������, ����������� generics*/
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