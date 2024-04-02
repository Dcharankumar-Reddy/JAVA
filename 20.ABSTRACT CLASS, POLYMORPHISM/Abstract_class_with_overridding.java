// Example on Abstract class with overRidding
abstract class First{
    abstract void display();
    void show()
    {
        System.out.println("\nFIrst -Good morning");
    }
    void project()
    {
       System.out.println("First -good evening");

    }
}
class Second extends First
{
    void show()
    {
        System.out.println("Good day");
    }
    void display()
    {
        System.out.println("First-Second -Good Morning");

    }
    void putdata()
    {
      System.out.println("First-Second-GOOD night");
    }
}

public class Abstract_class_with_overridding 
{
  public static void main(String arg[])
  {
    Second s=new Second();
    s.show();
    s.display();
    s.putdata();
    s.project();
    First f=new Second();
    f.show();
    f.display();
    f.project();
    //f.putdata();
  }
}
