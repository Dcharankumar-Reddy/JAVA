// Example on Abstract class
abstract class First
{
    abstract class display();
    void show()
    {
        System.out.println("Data -DGood mornining");

    }
}
class Second extends First
{
    void display()
    {
        System.out.println("First-Second-Good Evening");
    }
    void putdata()
    {
        System.out.println("Second -Good night");
    }
}
class Abstract{
  public static void main(String arg[])
  {
    Seecond s=new Second();
    s.show ();
    s.display();
    s.putdata();
  }
}