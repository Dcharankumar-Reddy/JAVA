// Example on Non parametric constructors
import java.util.*;
class Student
{
    private int Sno,tot;
    private String student_name;
    // Constructor
    Student()
    {
        Scanner  s=new Scanner(System.in);
        Sno=s.nextInt();
        student_name=s.next();
        tot=s.nextInt();

    }
    void display()
    {
        System.out.println(" Student  Number  is "+Sno);
        System.out.println("Student name is  "+student_name);
        System.out.println("Total marks of the Studnt is "+tot);

    }
}

class Collage_non_parametaric_constructors
{
  public static void main (String arg[])
  {
    Student t=new Student();
    t.display();
  }
}
