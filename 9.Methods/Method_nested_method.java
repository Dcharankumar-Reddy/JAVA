// Example on Nested Methods- 
//A method calling Another method is called nested method

//class Method_nested_method
import java.io.*;
public class Method_nested_method
{
  static int sum(int x,int y)
  { 
   
   int r=x+y;
   System.out.println(" the sum is   "  +r);
   return r;
   
  }  
  static int pro(int x,int y)
   {
   int k=x*y;
   System.out.println("the product is   "  +k);
   return k;
   }    
   public static void main ( String arg[])
   { 
    int a,b;
    System.out.println(" the out put of all programs");
     a=10;
     b=12; 
    sum(a,b); 
    pro(a,b);
   }
}  
