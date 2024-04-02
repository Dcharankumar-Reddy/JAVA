// Example on Interface Extending Interface
interface Cal1
{
    public void add(int x,int y);
}
interface Cal2 extends Cal1
{
    public void diff(int x,int y);
}
class Data implements Cal1
{
    public void add(int x,int y)
    {
        System.out.println("Sum is"+(x+y));

    }
    public void diff(int x,int y)
    {
        System.out.println("Difference is "+(x-y));

    }  
    public void div(int x,int y)
    {
        System.out.println("Division is "+(x/y));
    }
}
    

public class Intefaace_Extending_Interface 
{
  public static void main(String arg[])
  {
    Cal1 a=new Data();
    a.add(19,7);
    //d.diff(23,3);
    //d.div(12,2);
    Cal2 s=new Data();
    s.add(19,7);
    s.diff(23,3);
    //d.div(12,2);
   
  }
}
