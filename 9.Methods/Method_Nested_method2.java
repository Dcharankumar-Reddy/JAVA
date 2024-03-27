// Example on Methods- Using Nested_method2
class Method_Nested_method2
{
    static void sum(int x,int y)
    {
        System.out.println("WE are in sum Meethod");
        int res=x+y;
        System.out.println( "The  result is  ="+res);
    }
    static void prod(int m,int n)
    {
        System.out.println("WE are in sum Meethod");
        int re=m*n;
        System.out.println( "The  result is  ="+re);
    }
    public static void main(String arg[])
    {
        System.out.println("Greeting");
         int a=10;
         int b=20;
        sum(a,b);
        prod(a,b);
    }
}