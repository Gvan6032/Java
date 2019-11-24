package hw_14.task_4;
//import org.apache.commons.lang3.StringUtils;

public class Task4 {
    /*Ќаписать StringUtils класс который умеет искать в тексте слова-полиндромы.
    –езультат работы программы - вывод на консоль всех полиндромов из текста.
    ”честь что в тексте могут быть зап€тые, точки, вопросительные и восклицательные знаки.
    ѕример строка: камень, бакаб и пороороп!
    Ќа экран должен быть вывод двух последних слов*/
    public static void main(String[] args) {
        String line = "камень, бакаб и пороороп!";
        StringUtils text = new StringUtils();
        System.out.println(text.getPolindrom(line));
    }
}
