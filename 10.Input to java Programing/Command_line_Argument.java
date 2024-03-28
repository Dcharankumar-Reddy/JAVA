// Exmaple on java command line Argument
/* 
class Command_line_Argument
{
    public static void main(String arg[])
    {
        int a,b,res;
        a=Integer.parseInt(arg[0]);
        b=Integer.parseInt(arg[1]);
        res=a+b;
        System.out.println("The Result is  "+res);

    }
    
}
*/
// Product of any three numbers by using command line Argument
import java.io.*;
class Command_line_Argument
{
    public static void main(String arg[])
    {
        int a,b,c;
        a=Integer.parseInt(arg[0]);
        b=Integer.parseInt(arg[1]);
        c=Integer.parseInt(arg[2]);
        int res=a*b*c;
        System.out.println("The final Result is"+res);
    }
}