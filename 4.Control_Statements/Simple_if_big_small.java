//Example on Simple if -compound Statement 
class Simple_if_big_small
{
    public static void main(String arg[])
    {
        int a=12,b=29,big,small;
        if (a>b)
        {
          big=a;
          small=b;
        }
        else
        { 
          big=b;
          small=a;
        }
        System.out.println("The big number is "+big);
        System.out.println("The small number is "+small);
    }
}