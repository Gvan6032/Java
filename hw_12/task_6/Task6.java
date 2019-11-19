package hw_12.task_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        /*Åñòü êëàññ Sportsman, ó êîòîðîãî åñòü ïîëÿ èìÿ è ñêîðîñòü, ñ êîòîðîé îí áåæèò, à òàêæå êîëëåêöèÿ ìåäàëåé, êîòîðûõ îí ïîëó÷èë
        íà ýñòàôåòå (ìîæíî â êà÷åñòâå êëþ÷à èñïîëüçîâàòü íîìåð çàáåãà).
        Ñîçäàòü ñïîðòñìåíîâ, êîòîðûå áóäóò ó÷àñòâîâàòü â çàáåãå.
        Äèñòàíöèÿ - 600ì. Îòôèëüòðîâàòü òåõ, êòî ïðîáåæàë ìåäëåííåå âñåõ, à ïåðâûì òðåì âðó÷èòü ìåäàëè - çîëîòî, ñåðåáðî è áðîíçó (enum).*/
        
         // не стоит использловать try-catch где это ненужно
        try {
            List<Sportsman> sportsmen = new ArrayList<>();
            addList(sportsmen);
            Map<Integer, String> keySportsmen = new HashMap<>();
            runningStart(sportsmen, 600, keySportsmen);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addList(List<Sportsman> sportsmenList) {
        sportsmenList.add(new Sportsman("Larry Free", 56.23));
        sportsmenList.add(new Sportsman("Garry Nuyman", 23.76));
        sportsmenList.add(new Sportsman("Kim Sikura", 50.76));
    }

    // а если будет коллекция из 1 спортсмена? или из двух? можно пробежаться в цикле по каждому элементу, так будет правильно
    public static void runningStart(List<Sportsman> sportsmanList, int distance, Map<Integer, String> mapSportsmen) {
        sportsmanList.sort(Sportsman::compareTo);
        Sportsman winner = sportsmanList.get(0);
        winner.setMedal(Medal.GOLD);
        mapSportsmen.put(1, String.valueOf(winner));
        Sportsman secondPlace = sportsmanList.get(1);
        secondPlace.setMedal(Medal.SILVER);
        mapSportsmen.put(2, String.valueOf(secondPlace));
        Sportsman lastPlace = sportsmanList.get(2);
        lastPlace.setMedal(Medal.BRONZE);
        mapSportsmen.put(2, String.valueOf(lastPlace));
        System.out.println("Distance " + distance + " m " + "places " + winner + " " + secondPlace + " " + lastPlace);
    }
}

