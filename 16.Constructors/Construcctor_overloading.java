class  Student
{
    private int Sno,tot;
    private  String name;
    //Non parametric Constructor
    Student()
    {
      Sno=1;
      name="charan";
      tot=876;
    }
    // parametric constructor
    Student(int x,String y, int z)
    {
        Sno=x;
        name=y;
        tot=z;
    }
    Student(int x,String y)
    {
        Sno=x;
        name=y;
        tot=789;


    }
    void display()
    {
        System.out.println("Student number is "+Sno);
        System.out.println("Student name is "+name);
        System.out.println("total marks are "+tot);
    }

}



public class Construcctor_overloading 
{
  public static void main(String arg[])
  {
    Student s=new Student ();
    Student s1=new Student (1,"charan",2345);

    Student s2=new Student (1,"ravi");


    s.display();
    s1.display();
    s2.display();
  }
}
