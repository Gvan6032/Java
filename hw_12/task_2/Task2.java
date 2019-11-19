package hw_12.task_2;


public class Task2 {
    public static void main(String[] args) {
        /*Íàïèñàòü ôóíêöèþ ïåðåâîäà ÷èñëà â ñòðîêó ñ äîáàâëåíèåì äåíåæíîé åäèíèöû. Íàïðèìåð, 5 -> 5 ðóáëåé.*/
        
        // не думаю что здесь тебе нужен try-catch
        try {
            Function<Integer, String> convert = number -> String.valueOf(number) + " rubles";
            System.out.println(convert.apply(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
