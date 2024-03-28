
import java.util.*;
public class Scanner_with_string 
{
   public static void main(String arg[])
   {
    Scanner t=new Scanner(System.in);
    String a,b,res;
    System.out.println("Enter the first name");
    a=t.next();
    System.out.println("Enter Second number");
    b=t.next();
    System.out.println("Concatination of two names");
    res=a+b;
    System.out.println(" My Nmae is Mr/Ms "+res);

   }
}
