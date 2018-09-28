import java.util.Scanner;

public class ThriceTurn{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean equal = false;
        int total = 0;
        double tally = 0;
        int triVal = 0;
        int triValTest = 0;
        String answer;

        //Round 1
        while(equal == false){
            int die1R1 = (int)(Math.random()*6 + 1);
            int die2R1 = (int)(Math.random()*6 + 1);
            int die3R1 = (int)(Math.random()*6 + 1);
            if (die1R1 == die2R1 && die2R1 == die3R1){
                triVal = die1R1;
                equal = true;
                System.out.println("Die 1: " + die1R1);
                System.out.println("Die 2: " + die2R1);
                System.out.println("Die 3: " + die3R1);
            } else {
                total = total + die1R1 + die2R1 + die3R1;
                System.out.println("Die 1: " + die1R1);
                System.out.println("Die 2: " + die2R1);
                System.out.println("Die 3: " + die3R1);
            } 
            int die1R2 = (int)(Math.random()*6 + 1);
            int die2R2 = (int)(Math.random()*6 + 1);
            int die3R2 = (int)(Math.random()*6 + 1);
            if (die1R2 == die2R2 && die2R2 == die3R2){
                triVal = die1R2;
                equal = true;
                System.out.println("Die 1: " + die1R2);
                System.out.println("Die 2: " + die2R2);
                System.out.println("Die 3: " + die3R2);
            } else {
                total = total + die1R1 + die2R1 + die3R1 + die1R2 + die2R2 + die3R2;
                System.out.println("Die 1: " + die1R2);
                System.out.println("Die 2: " + die2R2);
                System.out.println("Die 3: " + die3R2);
            }  
            int die1R3 = (int)(Math.random()*6 + 1);
            int die2R3 = (int)(Math.random()*6 + 1);
            int die3R3 = (int)(Math.random()*6 + 1);
            if (die1R3 == die2R3 && die2R3 == die3R3){
                triVal = die1R3;
                equal = true;
                System.out.println("Die 1: " + die1R3);
                System.out.println("Die 2: " + die2R3);
                System.out.println("Die 3: " + die3R3);
            } else {
                total = total + (die1R1 + die2R1 + die3R1 + die1R2 + die2R2 + die3R2) - die1R3 - die2R3 - die3R3;
                System.out.println("Die 1: " + die1R3);
                System.out.println("Die 2: " + die2R3);
                System.out.println("Die 3: " + die3R3);
            }
        }
        tally = total;
        System.out.println("Your trice value is: " + triVal);
        System.out.println("After round 1 your tally is: " + tally); 

        //Round 2
        for (int i = triVal; i >= 1; i--){
            int die1 = (int)(Math.random()*6 + 1);
            int die2 = (int)(Math.random()*6 + 1);
            int die3 = (int)(Math.random()*6 + 1);
            int value = die1 * die2 * die3;
            tally = tally + value;
        }
        System.out.println("After round 2 your tally is: " + tally);

        //Round 3
        boolean triple = false;
        double times = 0;
        while (triple == false){ 
            System.out.println("Would you like to roll? Y/N");
            answer = scan.nextLine();
            if(answer.equals("Y")){
                int die1 = (int)(Math.random()*6 + 1);
                int die2 = (int)(Math.random()*6 + 1);
                int die3 = (int)(Math.random()*6 + 1);
                System.out.println("Die 1 roll: " + die1);
                System.out.println("Die 2 roll: " + die2);
                System.out.println("Die 3 roll: " + die3);
                if(die1 == die2 && die2 == die3){
                    triValTest = die1;
                    triple = true;
                } else {
                    tally = tally + Math.pow(3, times);
                    times++;
                    System.out.println("Your current score is " + tally);
                }
                if(triVal == triValTest){
                    tally = tally * 3;
                    System.out.println("Your final score is " + tally);
                } else if(die1 == die2 && die2 == die3) {
                    tally = triValTest;
                    System.out.println("Your final score is " + tally);
                }       
            } else {
                System.out.println("Your final score is " + tally);
                triple = true;
            }
        }
    }
}
