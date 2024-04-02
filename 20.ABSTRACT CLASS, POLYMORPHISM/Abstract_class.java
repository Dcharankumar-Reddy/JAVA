// Example on Abstract class
abstract class First
{
    abstract void display();

    void show()
    {
        System.out.println("\nData -Good mornining");

    }
}
class Second extends First
{
    void display()
    {
        System.out.println("\nFirst-Second-Good Evening");
    }
    void putdata()
    {
        System.out.println("\nSecond -Good night");
    }
}
class Abstract_class
{
  public static void main(String arg[])
  {
    Second s=new Second();
    s.show ();
    s.display();
    s.putdata();
    // Abstract class object refering to its subclass
    First f=new Second();
    f.display();
    f.show();
    //f.putdata();// it cant refered

  }
}