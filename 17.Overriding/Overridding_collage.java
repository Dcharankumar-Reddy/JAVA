// Example on overridding- single inheritence
import java.util.*;
class Person
{
    int pno;
    String Name;
    void display()
    {
        System.out.println("Person number  is "+pno);
        System.out.println("person name is" +Name);

    }

}
class Student extends Person
{
    int Sno,m1,m2,tot;
    String s_name;
    void show()
    {
        super.display();
      System.out.println("Student number is "+Sno);
      System.out.println("Marks are "+m1+" "+m2);
      System.out.println("Student name  is "+s_name);
      int tot =m1+m2;
      System.out.println("Total marks are "+tot);



    }
}
class Overridding_collage
{
    public static void main (String ar[])
    {
        Student s1=new Student ();
        Scanner  s=new Scanner(System.in);
        System.out.println("Enter person number ");
        s1.pno=s.nextInt();
        System.out.println("Enter person name ");
        s1.Name=s.next();
        System.out.println("Enter Student number ");
        s1.Sno=s.nextInt();
        System.out.println("Enter Student name ");
        s1.s_name=s.next();
        System.out.println("Enter m1 ");
        s1.m1=s.nextInt();
        System.out.println("Enter m2 ");
        s1.m2=s.nextInt();

        s1.show();
    }
}