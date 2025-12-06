public class Task {
    private String taskname;
    private int energyCost;
    private Robot taskrobot;

    public int getEnergyCost() {return energyCost;}
    public void setEnergyCost(int energyCost) {this.energyCost = energyCost;}
    public String getTaskname() {return taskname;}
    public void setTaskname(String taskname) {this.taskname = taskname;}
    public Robot getTaskrobot() {return taskrobot;}
    public void setTaskrobot(Robot robot) {this.taskrobot = robot;}


    public Task(String taskname, int energyCost,Robot taskrobot){
        this.taskname=taskname;
        this.energyCost=energyCost;
        this.taskrobot=taskrobot;
    }



}
