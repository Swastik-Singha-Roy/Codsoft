import java.util.*;
public class ATM
{
    public double balance;
    public ATM()
    {
        this.balance = 100;
    }
    public static void main(String args[])
    {
        int n = 1;
        ATM obj = new ATM();
        do
        {  
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to ATM! \nEnter your choice:");
            System.out.println("Press 1 to withdraw amount. \nPress 2 to deposit amount. \nPress 3 to check balance.");
            int choice = sc.nextInt();
            double amount = 0;
            switch(choice)
            {
                case 1:
                    System.out.println("Enter amount to be withdrawn : ");
                    amount = sc.nextDouble();
                    obj.withdraw(amount);
                    break;
                case 2:
                    System.out.println("Enter amount to be deposited : ");
                    amount = sc.nextDouble();
                    obj.deposit(amount);
                    break;
                case 3:
                    obj.checkBalance();
                    break;
                default:
            }
            System.out.println("Press 1 to continue. \nPress any other number to exit");
            n = sc.nextInt();
        }while(n==1);
    }
    public void withdraw(double amount)
    {
        if(amount<=balance){
            System.out.println("Withdrawn amount : " + amount);
            balance -= amount;
        }
        else
            System.out.println("Not enough balance");
    }
    public void deposit(double amount)
    {
        System.out.println("Deposited amount : " + amount);
        balance += amount;
    }
    public void checkBalance()
    {
        System.out.println("Balance : " + balance);
    }
}
