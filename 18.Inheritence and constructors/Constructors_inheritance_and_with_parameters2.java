// Example on Constructors inheritance parameters super()-overridding
class First{ 
private int a;
First(int a)
{
   this.a=a;
}
void display()
{
    System.out.println("a= "+a);
    System.out.println("Good morning");
}
}
class Second extends First
{
    private int b;
    Second(int a,int b)
    {
        super(a);
        this.b=b;
    }
    void display()
    {
        super.display();
        System.out.println("b= "+b);
        System.out.println("Good Afternoon");

    }
}
class Thired extends Second
{
    private int c;
    Thired(int a,int b,int c)
    {
        super(a,b);
        this.c=c;

    }
    void display()
    {
        super.display();
        System.out.println("c= "+c);
        System.out.println("Good night");
    }
}
public class Constructors_inheritance_and_with_parameters2 
{
  public static void main(String arg[])
  {
    Thired t=new Thired(12,23,34);
    t.display();
  }
}
