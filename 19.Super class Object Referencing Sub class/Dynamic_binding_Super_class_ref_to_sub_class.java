// Example on Dynamic binding -Super class Ref to sub class
import java.util.*;
class Data 
{
 int a,b;
 void show()
 {
    System.out.println("a= "+a);
    System.out.println("b= "+b);
 }
}
class Cal1 extends Data{
    void show()
    {
        System.out.println("sum is "+(a+b));

    }
}
class Cal2 extends Data{
    void show()
    {
        System.out.println("Product is "+(a*b));

    }
}
public class Dynamic_binding_Super_class_ref_to_sub_class 
{
  public static void main(String arg[])
  {
    Data ob;
    Cal1 ob1= new Cal1();
    Cal2 ob2=new  Cal2();
    Scanner s=new Scanner (System.in);
    ob1.a=s.nextInt();
    ob1.b=s.nextInt();
    ob2.a=s.nextInt();
    ob2.b=s.nextInt();
    ob=ob1;// Dynamic binding
    ob.show();//polymorphisam
    ob=ob2;// Dynamic binding
    ob.show();//polymorphisam
    
  }
}
