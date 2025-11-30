import java.util.Scanner;
public class BankAccount {
    private double accountid;
    private double balance;
    public void setAccountid(int accountid){
        this.accountid=accountid;
    }
    public double getAccountid(double accountid){
        accountid=this.accountid;
        return accountid;
    }
    public double getBalance(double balance){
        balance=this.balance;
        return balance;
    }
    public void  setBalance(double balance){
        this.balance=balance;
    }
     public BankAccount(){
         accountid=0;
         balance=0;
     }
     public void deposit(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the amount you want to deposit :");
         double d = sc.nextDouble();
         if (d>0)  {
             balance+=d;
             System.out.println("Successfully deposited "+d);
         }
         else System.out.println("Invalid deposit amount");
     }
     public void withdraw(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the amount you want to withdraw:");
         double w = sc.nextDouble();
         if (w<=balance){
             balance=balance-w;
             System.out.println("Successfully withdrawed"+w);
             System.out.println("Remaining amount: "+balance);
         }
         else {
             System.out.println("Do you want to borrow? Enter 1 for yes and 2 for no");
             int entry = sc.nextInt();
             switch (entry){
                 case (1):
                     balance=balance-w;
                 case (2):
                     System.out.println("Insufficient balance!");
             }


         }
     }
     public void accountdetails(){
         System.out.println("Account balance:"+balance+", Account ID:"+(int)accountid);

     }
}

