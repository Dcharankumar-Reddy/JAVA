// Example on Arrray of an Objects
import java.util.*;
 class Studeent 
 {
    int Sno,tot;;
    String name;

 }
class Array_of_Objects 
{
    public static void main(String arg[])
    {
        Student s=new Student[3];
        s[0]=new Student();
        s[1]=new Student();
        s[2]=new Student();
       
        s[0].Sno=1;
        s[0].name="Charan";
        s[0].tot=300;
        
        s[1].Sno=1;
        s[1].name="Charan";
        s[1].tot=300;

        s[2].Sno=1;
        s[2].name="Charan";
        s[2].tot=300;

        System.out.println("Student number is "+s[0].Sno);
        System.out.println("Student  name is "+s[0].name);
        System.out.println("Total maraks of the Student is"+s[0].tot);

        System.out.println("Student number is "+s[1].Sno);
        System.out.println("Student  name is "+s[1].name);
        System.out.println("Total maraks of the Student is"+s[1].tot);

        System.out.println("Student number is "+s[2].Sno);
        System.out.println("Student  name is "+s[2].name);
        System.out.println("Total maraks of the Student is"+s[2].tot);

    }
}
