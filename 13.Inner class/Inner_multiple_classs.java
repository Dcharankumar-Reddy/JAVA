// Inner class 
// two Types 1)Inner class 2)static inner class
// Inner class are three types 1)local inner 2) Methhod local inner class 3)Anonymous Inner class
/*
 Theory on inner class
 =>If one class uses services  of another class Regularly
 =>constant Dependency
  Eg=Student-faculty
  Student -Book
  Employee-offic
  Husband-Wife

 */
// Exaple on multiple classes
//import java.util.*;
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
        System.out.println("Book name "+bname);
    }
}
class Student
{
    String student_name;
    void studentname()
    {
        System.out.println("Student name is "+student_name);
    }
}
class Inner_multiple_classs
{
    public static void main(String arg[])
    {
        Book b=new Book();
        Student s=new Student();
        Collage_name c=new Collage_name();
        b.bname="java";
        s.student_name="charan";
        c.collage_name="VITAP";
        s.studentname();
        b.book();
        c.collage_name();

    }
}