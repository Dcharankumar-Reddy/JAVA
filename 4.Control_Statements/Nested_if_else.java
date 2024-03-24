//Example on Nested if Else
class Nested_if_else
{
    public static void main(String arg[])
    {
        int a=5,b=10,c=15,big;
        if (a>b)
          if(a>c)
            big=a;
          else
            big=c;
        else  
           if(b>c)
            big=b;
           else
             big=c;
    System.out.println("the big number   "+big);             
    }
}