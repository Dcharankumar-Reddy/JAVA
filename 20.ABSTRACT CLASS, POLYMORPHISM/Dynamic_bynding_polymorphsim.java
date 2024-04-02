// Example on Dynamic binding polymorphism
import java.util.*;
abstract class  Data
{
    int a,b;
    abstract void show();

}
class Cal1 extends Data{
    void show()
    {
        Stem.out.println("sum is"+(a+b));

    }
}
class Cal2 extends Data
{
    void show()
    {        System.out.println("Product is "+(a*b));

    }
}

public class Dynamic_bynding_polymorphsim 
{
  public static void main(String arg[])
  {
    Data ob;
    Cal1 ob1=new Cal1();
    Cal2 ob2=new Cal2();
    Scanner s=new Scanner();
    ob1.a=s.nextInt();
    ob1.b=s.nextInt();
    ob2.a=s.nextInt();
    ob2.a=s.nextInt();
    ob=ob1;
    ob=ob2;
    ob1.show();
    ob2.show();

  }
}
