// Exmaple on the outer class member using inner class 
class Student 
{
    String student_name;
    class Book
    {
        String bname;
        void book_name()
        {
            System.out.println("Name of the Student is "+student_name);
            System.out.println("Name of the book is  "+bname);
        }
        
    }
}

public class Outer_class_members_used_in_inner_class 
{
   public static void main (String arg[])
   {
    Student s=new Student ();
    Student.Book b=s.new Book();
    s.student_name="Charan";
    b.bname="JAVA";
    b.book_name();

   }
}
