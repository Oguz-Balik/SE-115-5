public class Robot {
    private String modelname;
    private int batterylevel;
    private String status;

     public Robot(String modelname,int batterylevel,String status){
         this.modelname=modelname;
         this.batterylevel=batterylevel;
         this.status=status;

     }

     public void setModelname(String modelname){this.modelname=modelname;}
     public String getModelname(){return modelname;}
     public void setBatterylevel(int batterylevel){this.batterylevel=batterylevel;}
     public int getBatterylevel(){return batterylevel;}
     public void setStatus(String status){this.status=status;}
     public String getStatus(){return status;}

    public void displayRobotInfo (){
        System.out.println("Robots model name: "+modelname+"   Battery level:%"+batterylevel);
        System.out.println("Status:"+status);
    }
    public boolean isBatteryEnough(int requiredAmount){
         return (batterylevel>=requiredAmount);
    }
    public int consumeBattery(int amount){
         if (batterylevel-amount <0){
             status="Deactive";
             batterylevel=0;
             return 0;
         }
         else return batterylevel-=amount;
    }
    public int chargeBattery(int amount){
         if (batterylevel>100){
             status="Active";
             return 100;
         }
         else {status="Charging";
             return batterylevel+=amount;}
    }
    public void performTask (Task t){
        System.out.println("Robot is attempting task "+t.getTaskname());
        if (this.status.equals("Charging")) System.out.println("Failure");
        else{
            if (batterylevel>=t.getEnergyCost()){
                batterylevel-=t.getEnergyCost();
                System.out.println("Robot has completed the task");}
            else System.out.println("Failed to complete task");}
    }
    public void performTaskBatch(TaskBatch batch){
        if (batch.getTaskCount()!=0){
            int totalcost2 = 0;
                totalcost2 += batch.getTotalEnergyCost2();
            if (batterylevel>=totalcost2){
                System.out.println("Robot is processing tasks");
                for (int a=0;a<batch.getTaskCount();a++){
                    if (batch.getTaskCount()!=0){this.performTask(batch.getTasks2(a));}
                    else {a=batch.getTaskCount();
                        System.out.println("Failure");}
                }
                displayRobotInfo();
            }
            else System.out.println("Failure");
        }
        else System.out.println("Failure");
    }

}
