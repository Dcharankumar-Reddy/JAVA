// Example on Methods- Using parameters
class Method_parameters
{
    static void sum(int x,int y)
    {
        System.out.println("WE are in sum Meethod");
        int res=x+y;
        System.out.println( "The  result is  ="+res);
    }
    public static void main(String arg[])
    {
        System.out.println("Greeting");
         int a=10;
         int b=20;
        sum(a,b);
    }
}