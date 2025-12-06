public class TaskBatch {
    private Task[] tasks= new Task[5];
    private int taskCount=0;
    private Task failure = new Task("Failure",0,new Robot("memo",100,"Active"));

    public void addTask(Task t){
        if (taskCount<5){
            this.tasks[taskCount]=t;
            taskCount++;
        }
        else System.out.println("Error");
    }
    public void getTotalEnergyCost () {
        if (taskCount!=0) {
            int totalcost = 0;
            for (int j = 0; j < taskCount; j++) {
                totalcost += this.tasks[j].getEnergyCost();
            }
            System.out.println("Total energy cost is: " + totalcost);
        }
        else System.out.println("Failure");
    }
    public int getTotalEnergyCost2 () {
            int totalcost = 0;
            for (int j = 0; j < taskCount; j++) {
                totalcost += this.tasks[j].getEnergyCost();
            }
            return totalcost;
    }

    public int getTaskCount() {return taskCount;}
    public void setTaskCount(int taskCount) {this.taskCount = taskCount;}


    public Task getTasks2(int a){
            return this.tasks[a];
    }
    public void getTasks(){
        if (taskCount!=0){
        for (int j=0;j<taskCount;j++){
            System.out.println(this.tasks[j]);
        }
        }
        else System.out.println("Failure");
    }
    public void printBatchInfo (){
        if (taskCount!=0){
        for (int j=0;j<taskCount;j++){
            System.out.println("Task name:"+this.tasks[j].getTaskname()+" Energy cost:"+this.tasks[j].getEnergyCost());
            }
        }
        else System.out.println("Failure");
    }


}
