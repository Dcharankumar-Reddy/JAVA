// Example on Nested block
class Block_Nested_block
{
    public static void main(String arg[])
    {
        int num=1234;
        {
            
            int a=12;
            System.out.println("A= "+a);
            System.out.println( "num is "+num);
            {
                int b=234;
                System.out.println("A= "+a);
                System.out.println("B= "+b);
                System.out.println( "num is "+num);
            }
        }
    }
}