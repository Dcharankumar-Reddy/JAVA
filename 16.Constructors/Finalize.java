// Example on finalize
import java.util.*; 
class Student 
{
    private int Sno,tot;
    private String name;
    Student (int Sno,String name,int tot)
    {
        Scanner s=new Scanner (System.in);
        this.Sno=s.nextInt();
        this.name=s.next();
        this.tot=s.nextInt();
    }
    protected void finalize()
    {
        System.out.println(" bye bye  ...");

    }
    void  display()
    {
        System.out.println("Student name is  "+name);
        System.out.println("Student number is   "+Sno);
        System.out.println("Tota marks are   "+tot);

    }
}
public class Finalize 
{
  public static void main(String arg[])
  {
    Student s=new Student(1,"charan",456);
    s.display();
    s.finalize();
  }
}
