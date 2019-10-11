package task_9;

public class Task9 {
    public static void main(String[] args) {
        // write your code here
        for (int i=1; i<=4; i++) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print("");
            }
            for (int z = i; z > 0; z--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
        for (int i= 4; i>0;i--) {
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            System.out.print("");
            for (int j =i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
