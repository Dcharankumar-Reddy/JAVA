// Example on local inner class -privateing the class 
class Student
{
    String student_name;
    void student_name()
    {
        Book b=new Book();
        b.bname="JAVA";
        b.book_name();
        System.out.println("Name of the Student is  "+student_name);
    }
     private class Book
    {
        String bname;
        void book_name()
        {
            System.out.println("Name of thee Book is  "+bname);
        }
        
    }
}
public class  Priavate_inner_class
{
   public static void main(String ayg[])
   {
    Student s=new Student();

    s.student_name="charan";
    s.student_name();

    

    

   }
}
