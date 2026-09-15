package TASK1_NUMBERGAME;

import java.util.Scanner;
import java.util.Random;

public class NUMBERGAME{
    public static void main(String[] args){
         int Count = 0;
        Scanner sc = new Scanner(System.in);
        Random  randomNo = new Random();
        
        int Goal = randomNo.nextInt(4)+1;
          
        for(int i = 1; i <=5; i++){
            
            System.out.println("ENTER YOUR GUESS NUMBER!");
            int guess = sc.nextInt();
             Count++;
            if(guess == Goal){
                System.out.println("YOUR GUESS IS CORRECT");
                System.out.println("Congratulation you are win a game");
                System.out.println("RESTART GAME");
                System.out.println("TOTAL GUESS"+ " "+ "="+ " " + Count);
                sc.close();
               return; 
            }
            else if (guess < Goal){
                System.out.println("YOUR NUMBER IS LESS THAN WITH GOAL");
            }else{
                System.out.println("YOUR NUMBER IS GRATER THAN WITH GOAL");
            }
            
        }
        sc.close();
        System.out.println("TOTAL GUESS"+ " "+ "="+ " " + Count);
        System.out.println("PLEASE TRY AGAIN");
        System.out.println("RESTART GAME");
    }
}