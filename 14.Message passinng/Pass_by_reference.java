// Examqpl on Pass By reference and also input from the Keyboard

import java.util.*;
class Test
{   
    int a,b;
    void change(Test x)
    {
        x.a+=100;
        x.b+=100;
    }
    void show()
    {
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}

public class Pass_by_reference 
{
  public static void main (String arg[])
  {
    Test t=new Test();
    Scanner s=new Scanner(System.in);
    int a,b;
    t.a=s.nextInt();
    t.b=s.nextInt();
    System.out.println("value of a is "+t.a);
    System.out.println("value of b is  "+t.b);
    t.change(t);
    t.show();

    
  }
}
