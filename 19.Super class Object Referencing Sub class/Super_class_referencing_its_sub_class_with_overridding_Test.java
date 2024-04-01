// Example on Super class object referencing its subclass with Overriddding
import java.util.*;
class First
{
    int a;
    void show()
    {
        System.out.println("\nFirst a= "+a);
    }

}
class Second extends First
{
    int b;
    void show()
    {    super.show();
        System.out.println("\nSecond b="+b);
    }
}
class Third extends Second
{
    int c,sum;
    void show()
    {
        super.show();
        Scanner r=new Scanner(System.in);
        c=r.nextInt();
        System.out.println("Thired c="+c);
        sum=a+b+c;
        System.out.println("the Final result is "+sum);
    }
}
public class Super_class_referencing_its_sub_class_with_overridding_Test 
{
  public static void main (String arg[])
  {
    Third s=new Third();
    Scanner s1=new Scanner(System.in);
    s.a=s1.nextInt();
    s.b=s1.nextInt();
    s.c=s1.nextInt();

    s.show();
    Second ob=new Third();
    ob.a=s1.nextInt();
    ob.b=s1.nextInt();
    //ob.c=s1.nextInt();

    ob.show();
  }
}
