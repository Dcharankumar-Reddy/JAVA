// Example on Constructors And inheritance
class First
{
    First()
    {
        System.out.println("Good morning");

    }

}
class Second extends First
{
    Second()
    {
        System.out.println("Good Evening");

    } 
}
class Constructors_and_Inheritance
{
    public static void main(String arg[])
    {
        Second s=new Second();
    }
}