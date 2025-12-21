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
        if (month<0||month>11) return -99999;
        int diff;
        int maxdiff=-99999;
        int dailyproft=0;
        int dailyproft2=0;
          for (int i=0;i<DAYS-1;i++){
              dailyproft=0;
              dailyproft2=0;
              diff=0;
              for (int j=0;j<COMMS;j++){
                  dailyproft+=data[month][i][j];
                  dailyproft2+=data[month][i+1][j];
              }
              diff=dailyproft-dailyproft2;
              if (diff<0) diff=diff*-1;
              if (diff>maxdiff) maxdiff=diff;
          }

        return maxdiff;
    }

    public static String compareTwoCommodities(String c1, String c2) {
        boolean tst1=true;
        boolean tst2=true;
        int comm1=0;
        int comm2=0;
        int ccmm1=0;
        int ccmm2=0;
        for (int i=0;i<COMMS;i++){
            if (c1.equals(commodities[i])) {
                tst1=false;
                comm1=i;
            }
            if (c2.equals(commodities[i])){
                tst2=false;
                comm2=i;
            }
        }
        if (tst1||tst2) return "INVALID_COMMODITY";
        if (c1.equals(c2)) return "Equal";
        for (int i=0;i<MONTHS;i++){
            ccmm1+=mntlydata[i][comm1];
            ccmm2+=mntlydata[i][comm2];
        }
        int diff=0;
         if (ccmm1>ccmm2) diff=ccmm1-ccmm2;
         else if (ccmm2>ccmm1) diff=ccmm2-ccmm1;
        if (ccmm1==ccmm2) return "Equal";
        if (ccmm1>ccmm2) return c1+" is better by "+diff;
        else return c2+" is better by "+diff;

    }

    public static String bestWeekOfMonth(int month) {
        if (month<0||month>11) return "INVALID_MONTH";
        int week=0;
        int bestprft=-99999;
        int prft=0;
        for (int i=0;i<7;i++){
            for (int j=0;j<COMMS;j++){
                prft+=data[month][i][j];
            }
        }
        if (prft>bestprft) {
            bestprft=prft;
            week=1;}
        prft=0;
        for (int i=7;i<14;i++){
            for (int j=0;j<COMMS;j++){
                prft+=data[month][i][j];
            }
        }
        if (prft>bestprft) {
            bestprft=prft;
            week=2;}
        prft=0;
        for (int i=14;i<21;i++) {
            for (int j=0;j<COMMS;j++){
                prft+=data[month][i][j];
            }
        }
        if (prft>bestprft) {
            bestprft=prft;
            week=3;}
        prft=0;
        for (int i=21;i<28;i++){
            for (int j=0;j<COMMS;j++){
                prft+=data[month][i][j];
            }
        }
        if (prft>bestprft) {
            bestprft=prft;
            week=4;}

        return "Week "+week;
    }

    public static void main(String[] args) {
        loadData();
        System.out.println("Data loaded – ready for queries");
    }
}
