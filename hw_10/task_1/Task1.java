package hw_10.task_1;

public class Task1 {
    public static void main(String[] args) {
     /*������� ���������� (generic) �����, ������� � ������������ ��������� �������� ������������ ����. ��������
     � ������ �����, ������� �� ������� ��� ��� �� ��� �� ����� (�������� ��� ������ ��� ���������� getClass().getName())*/
        Generic<Integer> genericFirst = new Generic<Integer>();
        genericFirst.getClass(34);

        Generic<String> genericSecond = new Generic<String>();
        genericSecond.getClass("34");
    }
}
