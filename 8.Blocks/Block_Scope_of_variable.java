// Example on Blocks -scope of variable
// Note outer block variables are print in inner block but inner block variables are not print in outer block
// labeling the Blocks is identifing
class Block_Scope_of_variable 
{
    public static void main(String arg[])
    {
        int num=1000;
         {
            int a=12;
             System.out.println("a= "+a);
             System.out.println("num = "+num);
         }
         {
            double b=234.34;
            System.out.println("b= "+b);
            System.out.println("num = "+num);
         }
    }
}