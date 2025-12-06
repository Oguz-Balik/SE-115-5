import java.util.Scanner;
public class FactoryDemo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Robot r1 = new Robot("Robot1",100,"Active");
        Robot r2 = new Robot("Robot2",100,"Active");
        r1.displayRobotInfo();
        r2.displayRobotInfo();
        System.out.println("Enter the amount of battery to consume:");
        int batteryc = sc.nextInt();
        System.out.println("Remaining battery:"+r1.consumeBattery(batteryc));

        Task t1 = new Task("%20",20,r1);
         if ((r1.consumeBattery(t1.getEnergyCost()))<0) System.out.println("Not enough energy");
         else System.out.println("Enough energy");


         r2.displayRobotInfo();
         Task t2 = new Task("%5",5,r2);
         t2.setTaskrobot(r2);
         r2.displayRobotInfo();
         Robot r3 = new Robot("Ahmet Robot",100,"Active");
        Task t3 = new Task("%20",20,r3);
        Task t4 = new Task("%30",30,r3);
        Task t5 = new Task("%40",40,r3);
        TaskBatch batch1 = new TaskBatch();
        batch1.addTask(t3);
        batch1.addTask(t4);
        batch1.addTask(t5);
        batch1.printBatchInfo();
        batch1.getTotalEnergyCost();
        r3.displayRobotInfo();
        System.out.println();
        r3.performTaskBatch(batch1);

    }
}
