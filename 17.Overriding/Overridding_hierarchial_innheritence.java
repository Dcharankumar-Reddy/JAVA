// Example on Hierarchial inheritance
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
class Student  extends Person
{
    int Sno,m1,m2;
    String sname;
    void display2()
    {
        super.display();
      System.out.println("Student number is "+Sno);
      System.out.println("Studennnt namee is "+sname);
      System.out.println("marks are "+m1+" and"+m2);

    }
}
class Faculty extends Person
{
    int sal;
    void show()
    {   super.display();

        System.out.println("Salary is "+sal);
    }
}

public class Overridding_hierarchial_innheritence 
{
   public static void main(String arg[])
   {
    Scanner s=new Scanner (System.in);
    Student t=new Student();
    Faculty f=new Faculty();
    t.pno=s.nextInt();
    t.pname=s.next();
    t.Sno=s.nextInt();
    t.sname=s.next();
    t.m1=s.nextInt();
    t.m2=s.nextInt();
    f.sal=s.nextInt();
    t.display2();
    f.show();
   }
}






