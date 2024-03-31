// Example on Overridding data members
import java.util.*;
class Person
{
    int pno;
    String p_name;
    void display()
    {
        System.out.println("Person number is  "+pno);
        System.out.println("Persoon Name is "+p_name);

    }
}
class Student extends Person
{
    int Sno;
    String Student_name;
    void show()
    {   super.pno=102;
        super.display();
        System.out.println("Student number is "+Sno);
        System.out.println("student name is "+Student_name);

    }
}
public class Overridding_the_datamembers_collage 
{
   public static void main(String arg[])
   {
    Student s=new Student ();
    Scanner s1=new Scanner(System.in);
    s.Sno=s1.nextInt();
    s.Student_name=s1.next();
    //s.pno=s1.nextInt();
    s.p_name=s1.next();
    s.show();

   }
}
