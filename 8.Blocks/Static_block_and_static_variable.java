// Example on Static block and Static variable 
class Static_block_and_static_variable
{
    static int a;
    static    
    {
        a=100;
        System.out.println("the static block is "+a);
    }
    public static void main(String arg[])
    {
        System.out.println("iam main "+a);
    }
}