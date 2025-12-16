// Main.java — Students version
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
public class Main {
    static final int MONTHS = 12;
    static final int DAYS = 28;
    static final int COMMS = 5;
    static String[] commodities = {"Gold", "Oil", "Silver", "Wheat", "Copper"};
    static String[] months = {"January","February","March","April","May","June",
            "July","August","September","October","November","December"};
    static int[][][] data = new int[MONTHS][DAYS][COMMS];
    static int[][] mntlydata= new int[MONTHS][COMMS];


    // ======== REQUIRED METHOD LOAD DATA (Students fill this) ========
    public static void loadData() {
        Scanner sc1 = null;
        //JANUARY
        try {
            sc1 = new Scanner(Paths.get("January.txt"));
            while(sc1.hasNextLine()) {
                String[] info0 = sc1.nextLine().split(",");
                for (int j=0;j<28;j++){
                    for (int i=0;i<5;i++){
                        if (info0[1].equals(commodities[i])){
                            data[0][j][i]=Integer.parseInt(info0[2]);
                            mntlydata[0][i]+=data[0][j][i];
                        }
                    }
                }
            }
        } catch (IOException e){}

        //FEBRUARY

        try {
            sc1 = new Scanner(Paths.get("February.txt"));
            while(sc1.hasNextLine()) {
                String[] info0 = sc1.nextLine().split(",");
                for (int j=0;j<28;j++){
                    for (int i=0;i<5;i++){
                        if (info0[1].equals(commodities[i])){
                            data[1][j][i]=Integer.parseInt(info0[2]);
                            mntlydata[1][i]+=data[1][j][i];
                        }
                    }
                }
            }
        } catch (IOException e){}

        //MARCH
        try {
            sc1 = new Scanner(Paths.get("March.txt"));
            while(sc1.hasNextLine()) {
                String[] info0 = sc1.nextLine().split(",");
                for (int j=0;j<28;j++){
                    for (int i=0;i<5;i++){
                        if (info0[1].equals(commodities[i])){
                            data[2][j][i]=Integer.parseInt(info0[2]);
                            mntlydata[2][i]+=data[2][j][i];
                        }
                    }
                }
            }
        } catch (IOException e){}



        //APRİL

        try {
            sc1 = new Scanner(Paths.get("April.txt"));
            while(sc1.hasNextLine()) {
                String[] info0 = sc1.nextLine().split(",");
                for (int j=0;j<28;j++){
                    for (int i=0;i<5;i++){
                        if (info0[1].equals(commodities[i])){
                            data[3][j][i]=Integer.parseInt(info0[2]);
                            mntlydata[3][i]+=data[3][j][i];
                        }
                    }
                }
            }
        } catch (IOException e){}


        //MAY

        try {
            sc1 = new Scanner(Paths.get("May.txt"));
            while(sc1.hasNextLine()) {
                String[] info0 = sc1.nextLine().split(",");
                for (int j=0;j<28;j++){
                    for (int i=0;i<5;i++){
                        if (info0[1].equals(commodities[i])){
                            data[4][j][i]=Integer.parseInt(info0[2]);
                            mntlydata[4][i]+=data[4][j][i];
                        }
                    }
                }
            }
        } catch (IOException e){}

        //JUNE

        try {
            sc1 = new Scanner(Paths.get("June.txt"));
            while(sc1.hasNextLine()) {
                String[] info0 = sc1.nextLine().split(",");
                for (int j=0;j<28;j++){
                    for (int i=0;i<5;i++){
                        if (info0[1].equals(commodities[i])){
                            data[5][j][i]=Integer.parseInt(info0[2]);
                            mntlydata[5][i]+=data[5][j][i];
                        }
                    }
                }
            }
        } catch (IOException e){}

        //JULY

        try {
            sc1 = new Scanner(Paths.get("July.txt"));
            while(sc1.hasNextLine()) {
                String[] info0 = sc1.nextLine().split(",");
                for (int j=0;j<28;j++){
                    for (int i=0;i<5;i++){
                        if (info0[1].equals(commodities[i])){
                            data[6][j][i]=Integer.parseInt(info0[2]);
                            mntlydata[6][i]+=data[6][j][i];
                        }
                    }
                }
            }
        } catch (IOException e){}

        //AUGUST
        try {
            sc1 = new Scanner(Paths.get("August.txt"));
            while(sc1.hasNextLine()) {
                String[] info0 = sc1.nextLine().split(",");
                for (int j=0;j<28;j++){
                    for (int i=0;i<5;i++){
                        if (info0[1].equals(commodities[i])){
                            data[7][j][i]=Integer.parseInt(info0[2]);
                            mntlydata[7][i]+=data[7][j][i];
                        }
                    }
                }
            }
        } catch (IOException e){}


        //SEPTEMBER
        try {
            sc1 = new Scanner(Paths.get("September.txt"));
            while(sc1.hasNextLine()) {
                String[] info0 = sc1.nextLine().split(",");
                for (int j=0;j<28;j++){
                    for (int i=0;i<5;i++){
                        if (info0[1].equals(commodities[i])){
                            data[8][j][i]=Integer.parseInt(info0[2]);
                            mntlydata[8][i]+=data[8][j][i];
                        }
                    }
                }
            }
        } catch (IOException e){}


        //OCTOBER

        try {
            sc1 = new Scanner(Paths.get("October.txt"));
            while(sc1.hasNextLine()) {
                String[] info0 = sc1.nextLine().split(",");
                for (int j=0;j<28;j++){
                    for (int i=0;i<5;i++){
                        if (info0[1].equals(commodities[i])){
                            data[9][j][i]=Integer.parseInt(info0[2]);
                            mntlydata[9][i]+=data[9][j][i];
                        }
                    }
                }
            }
        } catch (IOException e){}


        //NOVEMBER

        try {
            sc1 = new Scanner(Paths.get("November.txt"));
            while(sc1.hasNextLine()) {
                String[] info0 = sc1.nextLine().split(",");
                for (int j=0;j<28;j++){
                    for (int i=0;i<5;i++){
                        if (info0[1].equals(commodities[i])){
                            data[10][j][i]=Integer.parseInt(info0[2]);
                            mntlydata[10][i]+=data[10][j][i];
                        }
                    }
                }
            }
        } catch (IOException e){}

        //DECEMBER

        try {
            sc1 = new Scanner(Paths.get("December.txt"));
            while(sc1.hasNextLine()) {
                String[] info0 = sc1.nextLine().split(",");
                for (int j=0;j<28;j++){
                    for (int i=0;i<5;i++){
                        if (info0[1].equals(commodities[i])){
                            data[11][j][i]=Integer.parseInt(info0[2]);
                            mntlydata[11][i]+=data[11][j][i];
                        }
                    }
                }
            }
        } catch (IOException e){}
    }

    // ======== 10 REQUIRED METHODS (Students fill these) ========

    public static String mostProfitableCommodityInMonth(int month) {
        if (month < 0 || month >= 12) {
            return "INVALID_MONTH";
        }
        int maxProfit = 0;
        String mostProfitableComm = "";
        for (int i=0;i<28;i++){
            for (int j=0;j<5;j++){
                if (data[month][i][j]>maxProfit) {
                    maxProfit=data[month][i][j];
                    mostProfitableComm=commodities[j];
                }
            }
        }
        return mostProfitableComm + " " + maxProfit;
    }



    public static int totalProfitOnDay(int month, int day) {
        if (month<0||month>=12) return -99999;
        else if (day<=0||day>28) return -99999;
        else {
            int totalprofit=0;
            for (int j=0;j<5;j++){
                totalprofit+=data[month][day][j];
            }
            return totalprofit;
        }}

    public static int commodityProfitInRange(String commodity, int from, int to) {
        return 1234;
    }

    public static int bestDayOfMonth(int month) {
        return 1234;
    }

    public static String bestMonthForCommodity(String comm) {
        return "DUMMY";
    }

    public static int consecutiveLossDays(String comm) {
        return 1234;
    }

    public static int daysAboveThreshold(String comm, int threshold) {
        return 1234;
    }

    public static int biggestDailySwing(int month) {
        return 1234;
    }

    public static String compareTwoCommodities(String c1, String c2) {
        return "DUMMY is better by 1234";
    }

    public static String bestWeekOfMonth(int month) {
        return "DUMMY";
    }

    public static void main(String[] args) {
        loadData();
        System.out.println("Data loaded – ready for queries");
    }
}
