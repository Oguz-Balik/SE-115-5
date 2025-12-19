// Main.java — Students version
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.*;
import java.util.*;

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
        try {
            for (int p = 0; p < MONTHS; p++) {
                Scanner sc = new Scanner(Paths.get("src/Data_Files/" + months[p] + ".txt"));
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
                while (sc.hasNextLine()) {
                    String[] info = sc.nextLine().split(",");

                    int day = Integer.parseInt(info[0])-1;
                    String comm = info[1];
                    int profit = Integer.parseInt(info[2]);

                    for (int i = 0; i < COMMS; i++) {
                        if (comm.equals(commodities[i])) {
                            data[p][day][i] = profit;
                            mntlydata[p][i] += profit;
                            break;
                        }
                    }
                }
                sc.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // ======== 10 REQUIRED METHODS (Students fill these) ========

    public static String mostProfitableCommodityInMonth(int month) {
        if (month < 0 || month >= 12) {
            return "INVALID_MONTH";
        }
        int maxProfit = -99999;
        String mostProfitableComm = "";
            for (int j = 0; j < COMMS; j++) {
                if (mntlydata[month][j] > maxProfit) {
                    maxProfit = mntlydata[month][j];
                    mostProfitableComm = commodities[j];
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
                totalprofit+=data[month][day-1][j];
            }
            return totalprofit;
        }}

    public static int commodityProfitInRange(String commodity, int from, int to) {
     int profit = 0;
     boolean cboo=false;
     for (int i=0;i<5;i++){
         if (commodity.equals(commodities[i])){
             cboo=true;
             break;
         }
     }
     if (!cboo) return -99999;
     if (from>to) return -99999;
     else if (from<1) return -99999;
     else if (to>28) return -99999;
     else {for (int i=0;i<5;i++){
        if (commodity.equals(commodities[i])){
            for (int j=from-1;j<to;j++){
                profit+=data[1][j][i];
            }
            break;
        }
     }
     }
     return profit;
    }

    public static int bestDayOfMonth(int month) {
        if (month<0||month>11) return -1;
        int bestday=-99999;
        int bestdaynum=0;
        for (int i=0;i<DAYS;i++){
            int soac=0;
            for (int j=0;j<COMMS;j++){
                soac+=data[month][i][j];
            }
            if (soac>bestday) {bestday=soac;
            bestdaynum=i;
            }
        }
        return bestdaynum+1;
    }

    public static String bestMonthForCommodity(String comm) {
       int bestcommmonth=-99999;
       boolean tst=true;
       String tst2="A";
       for (int i=0;i<COMMS;i++){
           if (comm.equals(commodities[i])){
               tst=false;
               for (int j=0;j<MONTHS;j++){
                   if (mntlydata[j][i]>bestcommmonth){
                       bestcommmonth=mntlydata[j][i];
                       tst2=months[j];
                   }
               }
               break;
           }
       }
        if (tst) return "INVALID_COMMODITY";
        return tst2;
    }

    public static int consecutiveLossDays(String comm) {
        boolean tst1=true;
        int streak;
        int streak0=0;
        for (int i=0;i<COMMS;i++){
            if (comm.equals(commodities[i])){
                for (int j=0;j<MONTHS;j++){
                    streak=0;
                    for (int y=0;y<DAYS;y++){
                        if (data[j][y][i]<0){
                            streak++;
                            if (streak>streak0) streak0=streak;
                        }
                        else streak=0;
                    }
                }
                tst1=false;
                break;
            }
        }
        if (tst1) return -1;
        return streak0;
    }

    public static int daysAboveThreshold(String comm, int threshold) {
        boolean tst=true;
        int counter=0;
        for (int i=0;i<COMMS;i++){
            if (comm.equals(commodities[i])){
                for (int j=0;j<MONTHS;j++){
                    for (int y=0;y<DAYS;y++){
                        if (data[j][y][i]>=threshold) counter++;
                    }
                }
                tst=false;
                break;
            }
        }
        if (tst) return -1;
        return counter;
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
