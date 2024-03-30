// Example on pass by value  and by using input from the keyboard
// When formal parameter are changed it will Not effect the parameterss
import java.util.*;
class Test
{
    void change (int x,int y)
    {
        x+=100;
        y+=200;
        System.out.println("Inside function ");
        System.out.println("value of x is "+x);
        System.out.println("vlaue of y is "+y);
    }
}
class Pass_by_value
{
    public static void main(String arg[])
    {  
         Scanner s= new Scanner(System.in);
         int a,b;
         a=s.nextInt();
         b=s.nextInt();
        Test t=new Test();
        System.out.println("Out side Function");
        t.change(a,b);
        System.out.println("value of a is "+a);
        System.out.println("value of b is  "+b);
    }
}