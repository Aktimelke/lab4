package ad211.babkov;

public class Student {
    private final String name;
    private final String surname;
    private int course;
    private final int group;
    private double average;

    public Student(String name,String surname,int course,int group,double average){
        this.name=name;
        this.surname=surname;
        this.course=course;
        this.group=group;
        this.average=average;
    }

    public void moveCourse(){
        course+=1;
    }
    public void setAverage(double average){
        this.average=average;
    }
    public double salary(double a){
        double salary = 0;
        if(a>90){
            salary = 3000;
        }
        else if(a>75){
            salary= 2000;
        }
        return salary;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getGroup(){
        return group;
    }
    public int getCourse(){
        return course;
    }
    public double getAverage(){
        return average;
    }
}
