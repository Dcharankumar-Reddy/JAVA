//Example on Overridding Multilevel inheritance
import java.util.*;
class Person 
{
    int pno;
    String pname;
    void display()
    {
        System.out.println("person number is "+pno);
        System.out.println("person name is "+pname);
    }
}
class Student extends Person
{
    int Sno,m1,m2;
    String sname;
    void display2()
    {   super.display();
        System.out.println("Student number is "+Sno);
        System.out.println("Student name is "+sname);
    }
}
class Result extends Student
{
    int tot;
    void show()
    {
       super.display2();
       int tot =m1+m2;
        System.out.println("toatal marks are"+tot);

    }
}
public class Overridding_Multilevel_inheritance_collage 
{
  public  static void main (String arg[])
  {
    Scanner s=new Scanner(System.in);
    Result r=new Result ();
    r.pno=s.nextInt();
    r.pname=s.next();
    r.Sno=s.nextInt();
    r.sname=s.next();
    r.m1=s.nextInt();
    r.m2=s.nextInt();
    r.show();
    
  }
}
