/// Example on inheritance -parameter super
class First{
    First()
    {
        System.out.println("Good morining");

    }
}
class Second extends First
{
    private int a;
    
    Second(int a)
    {
        
        this.a=a;
    }
    void display()
    {
        System.out.println("Good evening");
        System.out.println("a= "+a);
    }
}

public class Constructors_inheritance_and_with_NO_parameters 
{
 public static void main (String arg[])
 {
    Second s= new Second (3);
    s.display();
 }
}
