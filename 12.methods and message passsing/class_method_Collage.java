// Example on class Method
class Student 
{
     int Sno,tot;
     String name;

     void show()
     {
        System.out.println("Student number is "+Sno);
        System.out.println("Name of the Student is "+name);
        System.out.println("Total marks of thee Student is "+tot);

     }
}
class  class_method_Collage
{
    public static void main(String arg[])
    {
        Student s=new Student();
        s.Sno=1;
        s.name="Charan";
        s.tot=23;
        s.show();

    }
}