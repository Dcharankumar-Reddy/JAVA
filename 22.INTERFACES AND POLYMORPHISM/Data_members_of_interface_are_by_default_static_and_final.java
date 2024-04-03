// Example on datamembers of interface are by default static and final
interface Cal1
{
    int a=100;
    public void add(int x,int y);
}
class Data implements Cal1
{
    public void add(int x,int y)
    {
        System.out.println("The sum is "+(x+y+a));

    }
}
public class Data_members_of_interface_are_by_default_static_and_final {
 public static void main(String arg[])
 {
    Cal1 ob1=new Data();
      ob1.add(10,66);
      System.out.println("a="+Cal1.a);
     System.out.println("a= "+Data.a);
 }
}
