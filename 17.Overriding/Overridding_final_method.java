
// Example on overridding method
// Note: final method cannot be overridden
// Static also can not be overridden
import java.util.*;
class Person 
{
    int pno;
    String pname;
     final void display()
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
        int tot =m1+m2;
      System.out.println("Student number is "+Sno);
      System.out.println("Studennnt namee is "+sname);
      System.out.println("marks are "+m1+" and"+m2);
      System.out.println("Total marks are"+tot);

    }
}

 class Overridding_final_method
{
   public static void main(String arg[])
   {
    Scanner s=new Scanner (System.in);
    Student t=new Student ();
    t.Sno=s.nextInt();
    t.sname=s.next();
    t.m1=s.nextInt();
    t.m2=s.nextInt();
    
    t.display();
    
   }
}










