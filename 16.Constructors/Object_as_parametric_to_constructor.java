// Example on parametric to constructor
import java.util.*;
class Student 
{
    private int Sno,tot;
    private String name;
    // parametric constructor
    Student(int Sno,String name,int tot)
    {
        Scanner s=new Scanner (System.in);
        this.Sno=s.nextInt();
        this.name=s.next();
        this.tot=s.nextInt();
    }
    Student (Student x)
    {
        this.Sno=x.Sno;
        this.name=x.name;
        this.tot=x.tot;
    }
    void display()
    {
        System.out.println("Student number is "+Sno);
        System.out.println("Student name is "+name);
        System.out.println("total is"+tot);
    }

}








public class Object_as_parametric_to_constructor
 {
    public static void main(String arg[])
    {
        Student s=new Student (1,"charan",23);
        Student s1=new Student (s);
        s.display();
        s1.display();
    }
}
