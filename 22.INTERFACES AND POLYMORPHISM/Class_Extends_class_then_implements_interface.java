// Example on class extends Class and then implements interface
interface Cal1
{
    public void add(int x,int y);
}
class Cal2
{
    public void diff(int x, int y);
    {
        System.out.println("The Difference is "+(x-y));
    }
}
interface Cal3
{
    public void div(int x, int y);
}
class Data extends Cal2 implements Cal1,Cal3
{
    public void add(int x, int y)
    {
        System.out.println("The sum is "+(x+y));

    }
    public void pro(int x, int y)
    {
        System.out.println("The product is "+(x*y));
        
    }  
    public void div(int x,int y)
    {
        System.out.println("The division is "+(x/y));
        
    }
    
}

public class Class_Extends_class_then_implements_interface 
{
   public static void main(String arg[])
   {
    Cal1 ob1=new Data();
      ob1.add(10,7);
    Cal2 ob2=new Data();
      ob2.diff(122,45);
    Cal3 ob3=new Data();
       ob3.div(10,2);
    Data ob4=new Data();
      ob4.add(10,77);
      ob3.div(10,2);
      ob4.pro(10,7);



   }
}
