// Example on Static members 
// Static members can not call non static members
class Static_mehods4
{
    public static void main(String arg[])
    {
        int a=123;
        System.out.println("a= "+a);
        function1();
    }
    void function1()
    {
        System.out.println("Good morning ");
    }
}