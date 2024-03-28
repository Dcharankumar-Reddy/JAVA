
//Example on Input from the keyboard -Scanner from the input (Sum of two numbers)
import java.util.*;
class Scanner_Input 
{
   public static void main (String x[])
   {
    Scanner s=new Scanner(System.in);
    int a,b,res;
    System.out.println("Enter first number");
    a=s.nextInt();

    System.out.println("Enter Second Nummber");
    b=s.nextInt();
    res=a+b;
    System.out.println("The result is "+res);
   }
}
