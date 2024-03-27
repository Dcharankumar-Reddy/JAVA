// Example on Method Overloading-It is polimorfitic concept
// Examplee on Method ouerLoading
class Method_overloading
{
    static void sum(int x,int y)
    {
      int res1=x+y;
      System.out.println("Sum of two numbers "+res1);
    }
    static void sum(String x,String y)
    {
        String res2=x+y;
        System.out.println("Sum of two Strings"+res2);

    }
    static void sum(double x,double y)
    {
        double res3=x+y;
        System.out.println("Sum of two Real numbers"+res3);
    }
    // main program
    public static void main (String arg[])
    {
        sum(2,6);
        sum("Charan","kumar");
        sum(3.54,8.98);
    }
}