package hw_7.task_6;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void main (String [] args){
        String [] lineArray = {"I","love","create","weather","whiskey"};
        int j =0;
        ArrayList lineArrayNew = new ArrayList<String>();
        for (int i=0;i<lineArray.length; i++){
            if (lineArray[i].indexOf("w")==0)
            {
                lineArrayNew.add(lineArray[i]);
                j++;
            }
            else {
                if (lineArray[i].indexOf("W") == 0) {
                    lineArrayNew.add(lineArray[i]);
                }
                j++;
            };
        }
        System.out.println(lineArrayNew);
    }
}
