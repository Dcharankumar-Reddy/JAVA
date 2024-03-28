
// Exmaple on methods with parameters and localvariables

import java.util.*;
class Student
{
    int Sno,tot;
    String name;
    void total( int x,int y)
    {
       int tot =x+y;
       System.out.println("Marks are "+x+" and "+y);
       System.out.println("Toatal marks are "+tot);


    }
    void show()
    {
        System.out.println("Studnt Number is " +Sno);
        System.out.println("Studentt name is"+name);
        
    } 
}
public class Methods_with_parameters_and_localvariables 

{
    public static void main(String arg[])
    {
        int m1=90,m2=90;// local variable
        Student t=new Student ();
         t.Sno=1;
        t.name="Charan";
        t.show();
        t.total(m1,m2);
    }
}