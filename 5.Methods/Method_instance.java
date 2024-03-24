//Example on method -using instance variable(global)
class Method_instance
{
    static int x,y;
    static void sum()
    {
        System.out.println("Sum of two numbers");
        int res=x+y;
        System.out.println("the Result is   "+res);
        
    }
    static void mul()
    {
        System.out.println("product of two numbers");
         int pro=x*y;
        System.out.println("The result is"+pro);
    }
    static void sub()
    {
        System.out.println("Subtraction of two numbers");
        int sub=x-y;
        System.out.println("sub of  two is"+sub);
    }
    public static void main(String arg[])
    {
        x=23;;
        y=99;
        sum();
        mul();
        sub();
    }
}