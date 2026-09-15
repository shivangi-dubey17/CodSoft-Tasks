package TASK3_ATMINTERFACE;

public class BANK_ACCOUNT {
     private double Balance;

    BANK_ACCOUNT(double Balance){
        this.Balance = Balance;
    }

    public void Deposit(double Ammount){
        Balance = Balance + Ammount;
        System.out.println("YOUR AMMOUNT ARE DEPOSITE SUCCCESFULLY");
    }

    public void Withdraw(double Ammount){
        if(Ammount <= Balance){
            Balance = Balance - Ammount;
            System.out.println("COLLECT YOUR AMMOUNT");
        }
        else
            {
            System.out.println("INSUFFICENT BALANCE");
        }
    }

    public void CheckBalance(){
        System.out.println("YOUR BALANCE ARE = "+ Balance);
    }
}
