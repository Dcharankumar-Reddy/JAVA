// Example oon super class referencing its sub class 
import java.util.*;
class First
{
    int a;
    void show()
    {
        System.out.println("First a="+a);
    }
}
class Second extends First
{
    int b;
    void show ()
    {   super.show();
        System.out.println("Second b="+b);
    }
}
class  Super_class_referencing_its_sub_class_Test 
{
    public static void main(String arg[])
    {
        First f=new First();
        Scanner s=new Scanner(System.in);
        f.a=s.nextInt();
        f.show();
        Second s1=new Second();
        s1.a=s.nextInt();
        s1.b=s.nextInt();
        s1.show();

        First ob=new Second();
        ob.a=s.nextInt();
        ob.show();
    }
}