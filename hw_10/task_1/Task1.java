package hw_10.task_1;

public class Task1 {
    public static void main(String[] args) {
     /*—оздать обобщенный (generic) класс, который в конструкторе принимает аргумент неизвестного типа. —оздайте
     в классе метод, который бы выводил что это за тип на экран (получить им€ класса дл€ переменной getClass().getName())*/
        Generic<Integer> genericFirst = new Generic<Integer>();
        genericFirst.getClass(34);

        Generic<String> genericSecond = new Generic<String>();
        genericSecond.getClass("34");
    }
}
