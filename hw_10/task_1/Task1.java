package hw_10.task_1;

public class Task1 {
    public static void main(String[] args) {
     /*Ñîçäàòü îáîáùåííûé (generic) êëàññ, êîòîðûé â êîíñòðóêòîðå ïðèíèìàåò àðãóìåíò íåèçâåñòíîãî òèïà. Ñîçäàéòå
     â êëàññå ìåòîä, êîòîðûé áû âûâîäèë ÷òî ýòî çà òèï íà ýêðàí (ïîëó÷èòü èìÿ êëàññà äëÿ ïåðåìåííîé getClass().getName())*/
        Generic<Integer> genericFirst = new Generic<Integer>();
        genericFirst.getClass(34);

        Generic<String> genericSecond = new Generic<String>(); // Generic<String> genericSecond = new Generic<>();
        genericSecond.getClass("34"); // метод getClass() должен быть без аргументов
    }
}
