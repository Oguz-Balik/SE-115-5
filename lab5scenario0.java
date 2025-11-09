import java.util.Scanner;
public class lab5scenario0 {
    public static int fact(int a) {
        int prod=1;
        if (a==0) return (1);
        if (a==1) return (1);
        return (a * fact(a-1));

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter int");
        int x = sc.nextInt();
        System.out.println(fact(x));
    }
}
