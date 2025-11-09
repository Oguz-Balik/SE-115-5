import java.util.Scanner;
public class lab5scenario2 {
    public static long power(int x,int b){
        int c = 0;
        long prod = 1;
        while (b>0){
            prod=x*prod;
            b--;
        }
        return(prod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer.");
        int h = sc.nextInt();
        System.out.println("Enter power");
        int p = sc.nextInt();
        System.out.println(power(h,p));

    }
}
