// Exmaple on  Giving input  from thr keyboard to class object
import java.util.*;
class Student 
{
    int Sno,tot;
    String name;
    void show()
    {
        System.out.println("Stuent number is "+Sno);
        System.out.println("Name of the Student is "+name);
        System.out.println("Toatal maarks of the Student "+tot);

    }
}

class Input_to_class_Objeect 
{
   public static void main (String arg[])
   {
    Student r=new Student();
    Scanner s=new Scanner(System.in);
     System.out.println("Enter Student number");
    r.Sno=s.nextInt();
    System.out.println("EEnter name of the Student");
    r.name=s.next();
    System.out.println("Enter total marks of the Student");
    r.tot=s.nextInt();

    r.show();
   }
}
