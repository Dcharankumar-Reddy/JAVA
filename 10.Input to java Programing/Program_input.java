// Accept Student number and name,marks in three subjects,total,,average
import java.util.*;
class Program_input
{
    public static void main(String arg[])
    {
        int Sno,m1,m2,m3,tot,avg;
        String name;
        Sno=Integer.parseInt(arg[0]);
        name=arg[1];
        m1=Integer.parseInt(arg[2]);
        m2=Integer.parseInt(arg[3]);
        m3=Integer.parseInt(arg[4]);
        tot=m1+m2+m3;
        avg=tot/3;

        System.out.println("Student number is  "+Sno );
        System.out.println("Student name is "+name);
        System.out.println("marks in three Subjects"+m1+" "+m2+" "+m3);
        System.out.println("Total marks of the Student "+tot);
        System.out.println("Average marks of the Students "+avg);

    }
}