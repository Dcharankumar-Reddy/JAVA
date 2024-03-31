// Example on overridding multiple inheritance
// Note In java Multiple inheritence is not possible 
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
class Student  
{
    int Sno,m1,m2;
    String sname;
    void display2()
    {
        
      System.out.println("Student number is "+Sno);
      System.out.println("Studennnt namee is "+sname);
      System.out.println("marks are "+m1+" and"+m2);

    }
}
class Faculty extends Person,  Student
{
    int sal;
    void show()
    {   super.display();

        System.out.println("Salary is "+sal);
    }
}

public class Overridding_multiple_innheritance
{
   public static void main(String arg[])
   {
    Scanner s=new Scanner (System.in);

    Faculty f=new Faculty();
    f.pno=s.nextInt();
    f.pname=s.next();
    
    f.m1=s.nextInt();
    f.m2=s.nextInt();
    f.sal=s.nextInt();
    t.display2();
    f.show();
   }
}










