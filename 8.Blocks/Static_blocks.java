// Example on Static blocks
class Static_blocks
{
    static 
    {
        System.out.println("I am first");

    }
     public static void main(String arg[])
     {
        System.out.println("I am Second");
     }
     static 
     {
         System.out.println("I am third");
     }
     
}