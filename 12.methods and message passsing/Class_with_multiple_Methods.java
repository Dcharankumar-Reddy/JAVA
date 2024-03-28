/// Exmaple on Class with Mutiplee Methods
import java.util.*;
class Student 
{
    int Sno,m1,m2,tot,avg;
    String name;
    void total()
    {
        tot=m1+m2;
        System.out.println("Total Marks  of the Student is  "+tot);
    }
    void average()
    {
        avg=tot/3;
        System.out.println("Average Marks of the Student is"+avg);

    }
}

public class Class_with_multiple_Methods
{
   public static void main(String arg[])
   {
    Scanner s=new Scanner(System.in);
    Student r=new Student ();
    System.out.println("Enter name of the Student");
    r.name=s.next();
    System.out.println("Enter Student Number ");
    r.Sno=s.nextInt();
    System.out.println("Enter m1");
    r.m1=s.nextInt();
    System.out.println("Enter m2");
    r.m2=s.nextInt();
   r.total();
   r.average();



   }
}
