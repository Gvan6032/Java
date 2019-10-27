package hw_7.task_8;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
    public static void main (String [] args){
        String [] carMarkings = new String[5];
        carMarkings[0]="1.4";
        carMarkings[1]="2.0T";
        carMarkings[2]="1.8";
        carMarkings[3]="1.8";
        carMarkings[4]="1.4";
        for (int i=0;i<carMarkings.length;i++){
            if(carMarkings[i]=="1.4"){
                carMarkings[i]=carMarkings[i].replace(carMarkings[i],"2.0T");
            }
            if(carMarkings[i]=="1.8"){
                carMarkings[i]=carMarkings[i].replace(carMarkings[i],"1.8Т");
            }
        }
        System.out.println(Arrays.toString(carMarkings));
    }
}
