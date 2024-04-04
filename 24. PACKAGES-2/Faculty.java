package Collage;
public class Faculty 
{

    public int Fno;
    public  String Fname;
    public int sal,net,tax;
    public Faculty()
    {
        System.out.println("Faculty laogic");
    }
    public void salcal()
    {
        net=sal-tax;

    }
    public void display1()
    {
        System.out.println("Faculty number is "+Fno);
        System.out.println("Faculty name is "+Fname);
        System.out.println("Salary is "+sal);
        System.out.println("Tax is  "+tax);
        System.out.println("Net Salary is "+net);

    }
}
