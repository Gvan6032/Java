package hw_12.task_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        /*Есть класс Sportsman, у которого есть поля имя и скорость, с которой он бежит, а также коллекция медалей, которых он получил
        на эстафете (можно в качестве ключа использовать номер забега).
        Создать спортсменов, которые будут участвовать в забеге.
        Дистанция - 600м. Отфильтровать тех, кто пробежал медленнее всех, а первым трем вручить медали - золото, серебро и бронзу (enum).*/
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

