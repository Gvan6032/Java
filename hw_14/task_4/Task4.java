package hw_14.task_4;
//import org.apache.commons.lang3.StringUtils;

public class Task4 {
    /*�������� StringUtils ����� ������� ����� ������ � ������ �����-����������.
    ��������� ������ ��������� - ����� �� ������� ���� ����������� �� ������.
    ������ ��� � ������ ����� ���� �������, �����, �������������� � ��������������� �����.
    ������ ������: ������, ����� � ��������!
    �� ����� ������ ���� ����� ���� ��������� ����*/
    public static void main(String[] args) {
        String line = "������, ����� � ��������!";
        StringUtils text = new StringUtils();
        System.out.println(text.getPolindrom(line));
    }
}
