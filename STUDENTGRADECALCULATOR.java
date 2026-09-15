package TASK2_STUDENTGRADECALCULATOR;

import java.util.Scanner;

public class STUDENTGRADECALCULATOR {
    public static void main(String[] args) {
        System.out.println("STUDENT GRADE CALCULATOR");

        Scanner sc = new Scanner(System.in);

        System.out.println("HOW MANY SUBJECT");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("TOTAL SUBJECT"+ ":"+ n);

       String[] Subjects = new String[n];
            
        for(int i=0; i<n; i++){
        System.out.println("ENTER SUBJECT"+ (i+1)+ ":");
        Subjects[i] = sc.nextLine();
           } 

           System.out.println("\n YOUR SUBJECTS ARE :");

       for(int i=0; i<n; i++){
        System.out.println(Subjects[i]);
       }
        System.out.println("\n ENTER OBTAIN MARKS IN EACH SUBJECT RESPECTIVELY OUT OF 1000 ");
        int marks = 0;
        for(int i=0; i<n; i++){
         int obtainmarks = sc.nextInt();
         System.out.println("OBTAIN MARKS IN"+ " " +Subjects[i] + ":"+ obtainmarks);
         marks = marks + obtainmarks;
       }
       
       int totalmarks = marks;
       System.out.println("\n TOTAL MARKS OF ALL SUBJECT IS"+ ":"+totalmarks);

       double AveragePercentage = totalmarks/n;
       System.out.println("\n AVERAGE PERCENTAGE IS"+ ":"+AveragePercentage+"%");

       System.out.println("\n GIVEN GRADE ACCORDING TO AVERAGE PERCENTAGE");

       if (AveragePercentage >= 80) {
          System.out.println("\n Grade A");
       }
       else if(AveragePercentage <= 80 && AveragePercentage >= 75){
           System.out.println("\n Grade B");
       }
       else if(AveragePercentage <= 75 && AveragePercentage >= 60){
        System.out.println("\n Grade C");
       }
       else if(AveragePercentage <= 60 && AveragePercentage >= 50){
        System.out.println("\n Grade D");
       }
       else{
        System.out.println("\n YOU ARE FAIL");
       }

       sc.close();
    } 
}
 