package hw_14.task_4;
//import org.apache.commons.lang3.StringUtils;

// +
public class Task4 {
    /*Написать StringUtils класс который умеет искать в тексте слова-полиндромы.
    Результат работы программы - вывод на консоль всех полиндромов из текста.
    Учесть что в тексте могут быть запятые, точки, вопросительные и восклицательные знаки.
    Пример строка: камень, бакаб и пороороп!
    На экран должен быть вывод двух последних слов*/
    public static void main(String[] args) {
        String line = "камень, бакаб и пороороп!";
        StringUtils text = new StringUtils();
        System.out.println(text.getPolindrom(line));
    }
}
