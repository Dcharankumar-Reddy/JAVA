// Example on  Abstract class -real time Example
abstract class AB{
    void deposit()
    {
        System.out.println("Andhra bank deposit");
    }
    void  withdraw()
    {
        System.out.println("Andhra bank withdraw");

    }
}
class ABlones extends AB{
    void homelones()
    {
        System.out.println("Andhra bank  home loans");

    }
    void goldlones()
    {
        System.out.println("Andhra bank goldlones");

    }

}

public class Real_time_Example_on_abstract_class {
 public static void main(String arg[])
 {
    ABlones l=new ABlones();
    l.deposit();
    l.withdraw();
    l.homelones();
    l.goldlones();
    AB a =new ABlones();
    a.deposit();
    a.withdraw();
    //a.homelones();
    //a.goldlones();
 }
}
