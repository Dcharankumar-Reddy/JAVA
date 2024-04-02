public interface First {
    public void  cal1();
    public void  cal2();
}
class Second implements First
{
    
    public void cal1()
    {
        
        System.out.println("Good morning");
    }
    public void cal2()
    {
        
        System.out.println("Good Afternoon");
    }
    public void cal3()
    {
        System.out.println("Good Night");
    }
}
class Interface
{
    public static void main (String arg[])
    {
        Second  c=new Second ();
        c.cal1();
        c.cal2();
        c.cal2();
        First f=new Second();
        f.cal1();
        f.cal2();
        //f.cal3();
    }
}
