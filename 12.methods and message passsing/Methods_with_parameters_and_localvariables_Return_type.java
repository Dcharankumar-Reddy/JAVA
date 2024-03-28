// Example on Methods with parameters and local variable with returrn type
import java.util.*;
class Student
{
    int Sno;
    String name;
    void totalcal(int x,int y)
    {
         int tot=x+y;
        return tot;

    }
    void show()
    {
        System.out.println("Student number is "+Sno);
        System.out.println("Student name is "+name);
    
    }
}
public class Methods_with_parameters_and_localvariables_Return_type 
{
    public static void main(String arg[])
    {    
        int m1=22,m2=34;
        Student s=new Student();
        s.Sno=22;
        s.name="Charan";
        
        int res=s.totalcal(m1,m2);
        s.show();
        System.out.println(" marks are "+m1+"and"+m2);
        System.out.println("Final Result is "+res);
        

    }
}


