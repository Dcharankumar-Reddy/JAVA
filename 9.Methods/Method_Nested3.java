// Example on Methods- Nested method
class Method_Nested3
{
    static void sum(int x,int y)
    {
        int res=x+y;
        System.out.println("Sum is "+res);
        prod(x,y);
    }
    static void prod(int m,int n)
    {
        int pro=m*n;
        System.out.println("product of three number   "+pro);
    }
    public static void main(String arg[])
    {
        System.out.println("greetings");
        int a=10;
        int b=12;
        sum(a,b);
    }
}