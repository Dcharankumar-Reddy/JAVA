// A Static class can be refered directly without object
/// Example on  Static inner class 
class Student
{
    String student_name;
    void student_name()
    {
        System.out.println("Name of the Student is  "+student_name);
    }
    static class Book
    {
        String bname;
        void  book_name()
        {
            System.out.println("Name of the Book is "+bname);
        }
    }
}

public class Statc_inner_class 
{
   public static void main(String arg[])
   {
    Student s=new Student ();
    Student.Book b=new Student.Book();// Student.Book b=s.new Book();
    s.student_name="Hari";
    b.bname="java";
    s.student_name();
    b.book_name();
   }
}
