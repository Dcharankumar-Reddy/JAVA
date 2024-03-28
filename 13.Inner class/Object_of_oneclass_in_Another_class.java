class Collage_name
{
    String collage_name;
    void collage_name()
    {
        System.out.println("Collage namee is "+collage_name);
    }
}
class Book
{
    String bname;
    void book()
    {
        System.out.println("Book name is "+bname);
    }
}
class Student
{
    String sname;

    Book b=new Book();
    Collage_name c=new Collage_name();
    void student_name()
    {
        System.out.println("Name of the Student is "+sname);
    }
}
public class Object_of_oneclass_in_Another_class 
{
   public static void main (String arg[])
   {
    Student s=new Student();
    s.sname="Charan";
    s.b.bname="Java";
    s.c.collage_name="VITAP";
    s.student_name();
    s.b.book();
    s.c.collage_name();
   }
}
