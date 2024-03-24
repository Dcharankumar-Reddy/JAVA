//Example on Methods -Using parameters
class Method_using_parameters
{
    static void sum(int x,int y)
    {
        System.out.println("Sum of two numbers");
        int res=x+y;
        System.out.println("the result is"+res);
    }
    public static void main(String arg[])
    {
        int a,b;
        System.out.println("Greetinng");
        a=50;
        b=23;
        sum(a,b);
    }
}