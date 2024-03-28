// Examqple On class Witha in a method
class Student
{
    String name;
    void student_name()
    {
        System.out.println("Name of the Studet is "+name);
        Book b=new Book();
        b.bname="JAVA";
        System.out.println("Name of the Book is "+b.bname);
        class Book
        {
            String bname;
            void book_name()
            {
                System.out.println("name of th book is "+bname);
            }
        }
    }
}


public class Class_with_in_a_method 
{
    public static void main(String arg[])
    {
        Student s=new Student();
        s.name="Charan;";
        s.student_name();

    }

}
