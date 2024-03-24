// Example on  final -constant -final variables value canoot be changedd
class  Final_constant
{
    public static void main (String arg[])
    {
        int a=20;
        final  int b=100;
          a=a+100;
         System.out.println("a="+a);
         
         System.out.println("b="+b);
         a=a+100;
         System.out.println("a="+a);
         
    }
}