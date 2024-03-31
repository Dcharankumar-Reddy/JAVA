// Examaple on parametarized Constructors
class Student
{
    private int Sno,tot;
    private String name;
    Student(int x,String y,int z)
    {
        Sno=x;
        name=y;
        tot=z;
    }
    void display()
    {
        System.out.println("Student number is "+Sno);
        System.out.println("Student name is "+name);
        System.out.println("Total marks are  "+tot);
    }
}

public class Parametarized_constructors 
{
 public static void main(String arg[])
 {
    Student s=new Student(1,"Charan",12345);
    s.display();
 }
}
