import java.util.Random;
 public class lab6scenario2 {

     public static void main(String[] args) {
         Random gen1 = new Random();
         int x1 = gen1.nextInt(11)+10;
         int[] y1 = new int[x1];
         int x0 = 0;
         int x3 = 0;
          while (x0<x1){
              Random gen2 = new Random();
              int x2 = gen2.nextInt(100);
              y1[x0]=x2;
              System.out.println(x0+". = "+x2);
              x0++;
          }
         while (x3<x0){
             System.out.println(x3+". = "+y1[func(x3,x0)]);
             x3++;
         }

     }
     public static int func(int a,int b){
         if (a+1==b) return 0;
         else return a+1;

     }

 }