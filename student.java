public class student {
    String name;
    int age ;
    public student(){
        name = "John French" ;
        age = 15 ;
    }
    public student(String name,int age){
    this.name=name;
    this.age=age;
    }

    public void printStudentInfo(){
        System.out.println("Student name = "+name+", Student age = "+age);


    }


}
