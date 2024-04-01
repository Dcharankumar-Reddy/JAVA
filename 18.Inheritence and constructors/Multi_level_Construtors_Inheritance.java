// Examplpe on multi-level Constructor-inheritance
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
        System.out.println("Good Afternoon");
    }
}
class Thired extends Second
{
    Thired()
    {
        System.out.println("Good Night");
    }
}



public class Multi_level_Construtors_Inheritance 
{
   public static void main (String arg[])
   {
    Thired t=new Thired();
    Second s=new Second();
    First f=new First();
   }
}

