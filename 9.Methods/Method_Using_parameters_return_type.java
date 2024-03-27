// Example on Methods-using  parameters and Return type
class Method_Using_parameters_return_type
{
    static  int sum(int x,int y)
    {
        System.out.println("WE are in Sum method");
        int res=x+y;
        return res;

    }
    public static void main (String x[])
    {
        System.out.println("Greeting");
        int a=99;
        int b=32;
        int R=sum(a,b);
        System.out.println("The Result is"+R);
    }
}