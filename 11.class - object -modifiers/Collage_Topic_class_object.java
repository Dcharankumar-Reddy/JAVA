//Example on Class and Object
class Student
{
    int Sno,tot;
    String name;
}
class Collage_Topic_class_object
{
    public static void main(String arg[])
    {
     Student ss=new Student();// Here ss is a object 
     ss.Sno=123;
     ss.name="Charan";
     ss.tot=500;
     
     System.out.println("Student number is"+ss.Sno);
     System.out.println("Student name"+ss.name);
     System.out.println("Total marks of the Students "+ss.tot);


    }
}