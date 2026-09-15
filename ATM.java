package TASK3_ATMINTERFACE;

import  java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BANK_ACCOUNT account = new BANK_ACCOUNT(5000);

        while (true) {
            
        System.out.println("\n ATM MENU");

        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        
        System.out.println("ENTER YOUR CHOICE :");
        int Choice = sc.nextInt();

            switch (Choice) {
                case 1:
                    System.out.println("ENTER HOW MANY AMMOUNT ARE DEPOSITE");
                    double deposite = sc.nextInt();
                    account.Deposit(deposite);
                    break;
                
                case 2:
                    System.out.println("ENTER HOW MANY AMMOUNT ARE WITHDRAW");
                    double withdraw = sc.nextInt();
                    account.Withdraw(withdraw);
                    break;
                    
                case 3:
                    account.CheckBalance();
                    break;
                    
                case 4:
                    System.out.println("THANKU FOR USING ATM");
                    sc.close();
                    return;    
            
                default:
                    System.out.println("INVALID CHOICE . PLEASE TRY AGAIN");
            }
            
        }
    }
}
