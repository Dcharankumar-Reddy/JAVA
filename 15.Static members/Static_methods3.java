// Example on Static method
//Th static method can call Another static method
public class Static_methods3 
{
    public static void main(String arg[])
    {
        int a=12;
        System.out.println("a= "+a);
        function();
    }
    static void function ()
    {
        System.out.println("Goodmorning");
        function1();
    }
 
     static void function1()
     {
        System.out.println("Good Evening");
     }  
}    

