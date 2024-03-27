//Example on  Methos -Using instane variable(global)
class Method_Using_instance_variable
{
    static int a,b;
    static void fxn()
    {
      System.out.println("We are in Sum function ");
      int res=a+b;
     System.out.println("The Result is "+res);
    }
    public static void main(String arg[])
    {
        System.out.println("Greeting");
        a=50;
        b=10;
        fxn();
    }
}