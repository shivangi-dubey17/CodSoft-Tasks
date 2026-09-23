package TASK4_QUIZAPPLICATIONWITHTIMER;
import java.util.Scanner;


public class QUIZ_APPLICATION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] Questions = {
            "Which of the following is NOT considered one of the core pillars of Object-Oriented Programing ?",
            "What is the default value of an uninitialized instance variable of type boolean in JAVA",
            "In the JAVA Virtual Machine (JVM) architecture, where are actual class instance (object created using the new Keyword) Dynamically allocated at runtime ?",
            "What will be the output? \n int x = 10; \n System.out.println(x);",
            "What will be the output? \n int a = 5; \n int b = 2; \n System.out.println(a + b);"
         };

       String [][] Options = {
            {"Encapsulation", "Polymorphism", "Compilation", "Inheritance"},
            {"true", "null", "false", "o"},
            {"Stack memory", "Heap memoery", "Method area", "Program Counter (PC) Registar"},
            {"0", "10", "x", "Error"},
            {"52", "7", "3", "10"}
       };  
        int [] Answer = {3, 4, 2, 2, 2};

        int Score = 0;

        for(int i = 0; i < Questions.length; i++){
            System.out.println("\n"+ (i+1)+" . "+ Questions[i]+ "\n");

            for(int j = 0; j < 4; j++){
                System.out.println((j+1)+ " . "+ Options[i][j]);
            }
                 
            System.out.println("\n ENTER YOUR ANSWER");
            int answer = sc.nextInt();

            if(answer == Answer[i]){
               System.out.println("Correct !");
               Score++;
            }
               else
               {
                System.out.println("Wrong !");
               }
            }
             sc.close();
            System.out.println("\n YOUR SCORE ARE = "+ Score+ "/"+ Questions.length);

            }
    }


