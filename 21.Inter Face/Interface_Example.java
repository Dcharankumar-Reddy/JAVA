// Example on Inteface 
import java.util.*;
interface Cal1
{
    public void add( );
    public void diff();
}
class Data implements Cal1
{
    int a,b;
    public void add()
    {
        System.out.println("Good morning charan");
    }
    public void diff()
    {
        System.out.println("Good Afternoon charan");
    }
    public void div()
    {
        System.out.println("Good night charan");
    }
}

public class Interface_Example{
    public static void main(String arg[])
    {
       
        Data ob1=new Data();
       
           ob1.add();
           ob1.diff();
           ob1.div();
        Cal1 ob2=new Data();
        
           ob2.add();
           ob2.diff();
           //ob2.div(10,5);

    }

}
