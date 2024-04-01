// Example on Constructors -Inheritance and patrameters -super()-overridding
class First
{
    private int a;
    First(int a)
    {
        this.a=a;

    }
    void display()
    {
        System.out.println("First a="+a);

    }
}
class Second extends First
{
    private int b;
    Second (int a,int b)
    {
        super(a);
        this.b=b;
    }
    void display()
    {
        super.display();
        System.out.println("Second b= "+b);
    }
}
public class Constructors_inheritance_and_parameters 
{
   public static void main (String arg[])
   {
    Second s=new Second(5,10);
    s.display();
   }
}
