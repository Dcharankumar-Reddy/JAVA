// Example on Public private,Nomodifiers,with data members

import java.util.*;
class Student 
{
    int Sno;
    public int m1,m2;
     private int tot,avg;
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


class Public_private_nomodifiers_with_datamembers_and_methods 
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        Student r=new Student();
        r.Sno=s.nextInt();
        r.name=s.next();
        r.m1=s.nextInt();
        r.m2=s.nextInt();
        r.show();;

    }
}
