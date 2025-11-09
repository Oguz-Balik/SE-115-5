import java.util.Random;
public class lab6scenario3 {
    public static void main(String[] args) {
        int storm = 0;
        int cloud = 0;
        int sun = 0;
        int rain = 0;
        int[] y1 = new int[1000000];
        int x1 = 0;
        Random gen1 = new Random();
        while (x1<y1.length) {
            int n1 = gen1.nextInt(100);
            y1[x1]=n1;
            if (n1<10) storm++;
            else if (10<=n1&&n1<30) rain++;
            else if (30<=n1&&n1<60) cloud++;
            else if (60<=n1&&n1<100) sun++;
            x1++;
        }
        System.out.printf("Sunny: %d (%.2f)%n",sun,sun/10000.0);
        System.out.printf("Cloudy: %d (%.2f)%n",cloud,cloud/10000.0);
        System.out.printf("Rainy: %d (%.2f)%n",rain,rain/10000.0);
        System.out.printf("Stormy: %d (%.2f)%n",storm,storm/10000.0);
    }
}
