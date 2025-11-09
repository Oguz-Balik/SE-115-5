import java.util.Random;
public class lab6scenario4 {
    public static void main(String[] args) {
        Random gen1 = new Random();
        int[] x2 = new int[30];
        for (int i=0;i< x2.length;i++){
            int x1 = gen1.nextInt(100);
            x2[i]=x1;
        }
        int peak = 0;
        int tpeak = 0;
        for (int i=1;i<x2.length-1;i++){
            if (x2[i-1]<x2[i]&&x2[i+1]<x2[i]){
                peak++;
                System.out.println(x2[i]+" is a peak.");
                if (x2[i]>=tpeak) tpeak=x2[i];
            }
        }
        System.out.println("The number of peaks:"+peak);
        System.out.println("The tallest peak:"+tpeak);
    }
}
