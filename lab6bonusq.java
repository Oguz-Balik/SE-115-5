import java.util.Random;
public class lab6bonusq {
    public static void main(String[] args) {
        Random gen1 = new Random();
        int[][] sbr = new int[5][4];
        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 4; a++) {
                sbr[i][a] = gen1.nextInt(101);
            }

        }
        int[] x = new int[5];
        int[] y = new int[4];
        System.out.println("Score Table");
        for (int i = 0; i < sbr.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", sbr[i][j]);
                x[i] += sbr[i][j];
                y[j] += sbr[i][j];
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <5 ; i++) {
            System.out.println("Student " + (i + 1) + " average :" + (x[i] / 4.0));
        }
        System.out.println();
        int g = 1;
        for (int i = 0; i <4 ; i++) {
            System.out.println("Column "+(i+1)+" average is :"+y[g-1]/5.0);
            g++;
        }
        int maxscore = sbr[0][0];
        int maxstd = 0;
        int maxquiz = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (sbr[i][j] > maxscore) {
                    maxscore = sbr[i][j];
                    maxstd = i;
                    maxquiz = j;
                }
            }
        }
        System.out.println();
        System.out.println("Highest score :"+maxscore+" Student : "+(maxstd+1)+"  Quiz: "+(maxquiz+1));


        }
    }

