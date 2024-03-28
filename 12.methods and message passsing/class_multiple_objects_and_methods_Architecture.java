//Example  on class with multiple objects and methods -Architecture
class Student
{
    int Sno,tot;
    String name;
    void show()
    {
      System.out.println("Student Number is "+Sno);
      System.out.println("Studnt name is "+name);
      System.out.println("Total marks of the Stuudent is "+tot);
    }
}
public class class_multiple_objects_and_methods_Architecture 
{
    public static void main(String arg[])

   {
     Student s1= new Student ();
     Student s2= new Student ();
     s1.Sno=12;
     s1.name="Charan";
     s1.tot=345;

     s2.Sno=1;
     s2.name="Charan kumar Reddy";
     s2.tot=34345;
     
    s1.show();
    s2.show();
   }
}
