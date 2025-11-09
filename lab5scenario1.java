import java.util.Scanner;
public class lab5scenario1 {

    public static int sD(int n){
        if (n<10) return n;
        return n%10 + sD(n/10);



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer.");
        int b = sc.nextInt();
        System.out.println(sD(b));

    }

}
