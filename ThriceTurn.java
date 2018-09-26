import java.util.Scanner;

public class ThriceTurn{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean equal;
        int total = 0;
        
        while(equal = false){
            int die1R1 = (int)(Math.random()*6 + 1);
            int die2R1 = (int)(Math.random()*6 + 1);
            int die3R1 = (int)(Math.random()*6 + 1);
            total = die1R1 + die2R1 + die3R1;
            if (total == 3 || total == 6 || total == 9 || total == 12 || total == 15 || total == 18){
                equal = true;
            } else {
                int die1R2 = (int)(Math.random()*6 + 1);
                int die2R2 = (int)(Math.random()*6 + 1);
                int die3R2 = (int)(Math.random()*6 + 1);
                total = die1R1 + die2R1 + die3R1 + die1R2 + die2R2 + die3R2;
            } 
            if (total == 6 || total == 9 || total == 12 || total == 15 || total == 18 || total == 21 || total == 24 || total == 27 || total == 30 || total == 33 || total == 36){
                equal = true;
            } else {
                int die1R3 = (int)(Math.random()*6 + 1);
                int die2R3 = (int)(Math.random()*6 + 1);
                int die3R3 = (int)(Math.random()*6 + 1);
                total = (die1R1 + die2R1 + die3R1 + die1R2 + die2R2 + die3R2) - die1R3 - die2R3 - die3R3;
            }
        }
        System.out.println(total);
    }
}
