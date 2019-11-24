package hw_14.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtils {
    private String text;

    /*public StringUtils(String text){
        this.text=text;
    }*/

    public String getPolindrom(String text) {
        String polindrom = " ";
        boolean state;
        List<String> srtArray = new ArrayList<>();
        srtArray = Arrays.asList(text.split("\\s*(\\s|,|!|\\.)\\s*"));
        String temp = new String();
        for (int i = 0; i < srtArray.size(); i++) {
            state = false;
            temp = srtArray.get(i).toString();
            for (int j = 0; j < temp.length() / 2; j++) {
                if (temp.charAt(j) == temp.charAt(temp.length() - j - 1)) {
                    state = true;
                }
                ;
            }
            if (state) {
                polindrom = polindrom.concat(" ");
                polindrom = polindrom.concat(temp);
            }
        }
        return polindrom;
    }
}
