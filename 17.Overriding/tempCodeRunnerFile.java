// Example on overridding
class Person
{
    int pno;
    String Name;
    void show()
    {
        System.out.println("Person number  is "+pno);
        System.out.println("person name is" +name);

    }

}
class Student extends Person
{
    int Sno,m1,m2;
    String s_name;
    void show()
    {
      System.out.println("Student number is "Sno);
      System.out.println("Marks are "+m1+" "+m2);
      System.out.println(" Student name  is "+s_name);


    }
}
class Collage
{
    public static void main (String ar[])
    {
        Student s=new Student ();
        s.pno=12;
        s.Name="charan";
        s.m1=12;
        s.m2=2345;
        s.s_name="ravi";
        s.show();
    }
}