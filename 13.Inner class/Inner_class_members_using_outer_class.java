// Exmaple on inner class members uding inner classs
class Student
{
    String name;
    void student_name()
    {
        Book b=new Book();
        b.bname="JAVA";
        System.out.println("Name of the Student is "+name);
        System.out.println("book name is "+b.bname);
    }
    class Book{
        String bname;
    }
}
public class Inner_class_members_using_outer_class 
{
  public static void main(String arg[])
  {
    Student s=new Student();
    s.name="Charan";
    s.student_name();
  }
}
