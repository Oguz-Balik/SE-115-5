import java.util.Scanner;
public class lab7bonusq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product amount of the store:");
        int pa = sc.nextInt();
        Product[] paa = new Product[pa];
        for (int i=0;i< paa.length;i++){
            paa[i]=new Product();
            System.out.println("Enter product number "+(i+1)+" name");
            String j=sc.next();
            paa[i].setName(j);
            System.out.println("Enter product number "+(i+1)+" stock");
            int s = sc.nextInt();
            paa[i].setStock(s);
        }
        String ipn ="a";
        while (!ipn.equals("Q")){
        System.out.println("Enter the products' name that you want to buy:");
        System.out.println("(Enter Q if you want to quit.)");
        ipn = sc.next();
        for (int i=0;i< paa.length;i++){
            if (ipn.equals(paa[i].getName())) {
                    paa[i].buyOne();
            }
        }
    }
        for (int i=0;i< paa.length;i++){
            paa[i].printInfo();
        }
    }
}
