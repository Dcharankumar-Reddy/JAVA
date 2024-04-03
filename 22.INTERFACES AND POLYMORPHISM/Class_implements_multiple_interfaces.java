// Example on class Implements multiple interface
interface Cal1
{
    public void add(int x,int  y);
}
interface Cal2
{
    public void diff(int x,int y);
}
class Data implements Cal1,Cal2
{
   public void add(int x,int y)
   {
    System.out.println("The sum is "+(x+y));
   }
   public void diff(int x,int y )
   {
    System.out.println("The Difference is "+(x-y));
   }
   public void div(int x,int y)
   {
    System.out.println("Thd division is"+(x/y));
   }
}
class Class_implements_multiple_interfaces
{
    public static void main(String arg[])
    {
        Cal1 ob1=new Data();
        ob1.add(10,7);
        Cal2 ob2=new Data();
        ob2.diff(10,2);
        Data ob3=new Data();
        ob3.add(10,7);
        ob3.diff(10,2);
        ob3.div(10,2);

    }
}