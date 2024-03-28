/// Exmaple on Class with Mutiplee Methods
import java.util.*;
class Student 
{
    int Sno,m1,m2,tot,avg;
    String name;
    private void total()
    {
        tot=m1+m2;
        System.out.println("Total Marks  of the Student is  "+tot);
        average();

    }
     private void average()
    {
        avg=tot/3;
        System.out.println("Average Marks of the Student is"+avg);

    }
    public void show()
    {
       
        System.out.println("Name of the Student is "+name);
        System.out.println("Student numbr is "+Sno);
        System.out.println("Marks of the Student is "+m1+" "+m2);
        total();
    }
}

public class class_with_nested_methods_and_methods_with_modifiers 
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
   //r.total();
   //r.average();
   r.show();


   }
}


//public class class_with_nested_methods_and_methods_with_modifiers 


