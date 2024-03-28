// Example on local inner class 
class Student
{
    String student_name;
    void student_name()
    {
        System.out.println("Name of the Student is  "+student_name);
    }
    class Book
    {
        String bname;
        void book_name()
        {
            System.out.println("Name of thee Book is  "+bname);
        }
        class Collage_name
        {
         String collage_name;
         void collage_name()
           {
                  System.out.println("Collage namee is "+collage_name);
                }
        }
    }
}
public class Locall_Inner_class
{
   public static void main(String ayg[])
   {
    Student s=new Student();
    Student.Book b=s.new Book ();
    Student.Book.Collage_name c=s.b.new Collage_name();

    s.student_name="charan";
    b.bname="JAVA";
    c.collage_name="VITAP";

    s.student_name();
    b.book_name();
    c.collage_name();

    

   }
}
