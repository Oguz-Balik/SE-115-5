import java.util.Scanner;
import java.util.Random;
public class lab7scenario2 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount();
        Scanner sc = new Scanner(System.in);
        Random gen1 = new Random();
        int baa1 = 100000+ gen1.nextInt(99999);
        ba1.setAccountid(baa1);
        int baa2 = 100000+ gen1.nextInt(99999);
        int baa3 = 100000+ gen1.nextInt(99999);
        int baa4 = 100000+ gen1.nextInt(99999);
        ba1.setAccountid(baa2);
        System.out.println("For bank account 1");
        System.out.println("1-> Deposit");
        System.out.println("2-> Withdraw");
        System.out.println("3-> Acount Details");
        System.out.println("4-> Exit");
        int m=0;
        while (m!=4){
        m = sc.nextInt();
        switch (m) {
            case (1):
                ba1.deposit();
                break;
            case (2):
                ba1.withdraw();
                break;
            case (3):
                ba1.accountdetails();
                System.out.println("Do you want to change your account id?" + " Press 1 for yes and 2 for no");
                int p = sc.nextInt();
                switch (p){
                    case (1):
                        System.out.printf("%s,%f","Old account id: ",ba1.getAccountid(65));
                        ba1.setAccountid(baa4);
                        System.out.println(" New account id :"+ba1.getAccountid(6));
                        break;
                    case (2):
                        break;
                    default:
                        System.out.println("Invalid entry");
                }
                break;
            case (4):
                System.out.printf("%s", "Account 1 balance: ");
                System.out.println(ba1.getBalance(5));
                System.out.printf("%s", "Account 1 id: ");
                System.out.println((int) ba1.getAccountid(5));
              break;
            default:
                System.out.println("Invalid entry, enter a proper number.");
                break;
        }
            System.out.println("For bank account 2");
            System.out.println("1-> Deposit");
            System.out.println("2-> Withdraw");
            System.out.println("3-> Acount Details");
            System.out.println("4-> Exit");
            int b=0;
            while (b!=4){
                b = sc.nextInt();
                switch (b) {
                    case (1):
                        ba2.deposit();
                        break;
                    case (2):
                        ba2.withdraw();
                        break;
                    case (3):
                        ba2.accountdetails();
                        System.out.println("Do you want to change your account id? Press 1 for yes and 2 for no");
                        int p = sc.nextInt();
                        switch (p){
                            case (1):
                                System.out.printf("%s,%f","Old account id: ",ba2.getAccountid(65));
                                ba2.setAccountid(baa3);
                                System.out.println(" New account id :"+ba2.getAccountid(6));
                                break;
                            case (2):
                                break;
                            default:
                                System.out.println("Invalid entry");
                        }
                        break;
                    case (4):
                        System.out.printf("%s", "Account 2 balance: ");
                        System.out.println(ba2.getBalance(5));
                        System.out.printf("%s", "Account 2 id: ");
                        System.out.println((int) ba2.getAccountid(5));
                        break;
                    default:
                        System.out.println("Invalid entry, enter a proper number.");
                }



    }
}
}
}
