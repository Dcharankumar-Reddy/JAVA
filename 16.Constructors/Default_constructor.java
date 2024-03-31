// Eample on Default constructor
class Student
{
    private int Sno,tot;
    private String student_name;
    void display()
    {   
        System.out.println("Student number is "+Sno);
        System.out.println("Name of the Student is "+student_name);
        System.out.println("Total marks are "+tot);
        
    }
}
public class Default_constructor 
{
   public static void main(String arg[])
   {
    Student s=new Student ();
    s.display();
   }
}
