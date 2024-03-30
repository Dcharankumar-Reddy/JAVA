// Example on Static methods
//Static vaiables can  hold/retrain the previous values
class Test
{  
    int a=0;
    static int b;
    void change()
    {
        a++;
        b++;
        System.out.println("a= "+a+ "static b = "+b);

    }
}
public class Staatic_Methods5 
{
  public static void main(String arg[])
  {
    Test t=new Test();
    //Scanner s=new Scanner(System.in);
    t.change();
    t.change();
    t.change();
  }
}
