// Example on polymorphism using interface
interface Data
{
    public void cal(int x,int y);
}
class First implements Data{
public void Cal(int x,int y)
{
    System.out.println("Sum is "+(x+y));
}
}
class Second implements Data{
public void Cal(int x,int y)
{
    System.out.println(" The product is "+(x*y));
}
}


public class Polymorphism_Using_interface {
 public static void main(String arg[])
 {
    Data ob;
    First ob1=new First();
    Second ob2=new Second();
    ob=ob1;
    ob.Cal(10,22);
    ob=ob2;
    ob.Cal(10,66);
 }
}
