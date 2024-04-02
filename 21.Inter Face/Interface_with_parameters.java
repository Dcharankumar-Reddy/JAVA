// Example on Inteface with parameters
interface Cal1
{
    public void add( int x,int y);
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
        System.out.println("diff is"+(x-y));
    }
    public void div(int x,int y)
    {
        System.out.println("div is"+(x/y));
    }
}

public class Interface_with_parameters {
    public static void main(String arg[])
    {
        Data ob1=new Data();
           ob1.add(10,3);
           ob1.diff(10,3);
           ob1.div(10,3);
        Cal1 ob2=new Data();
           ob2.add(10,5);
           ob2.diff(10,4);
           //ob2.div(10,5);

    }

}
