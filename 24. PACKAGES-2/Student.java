// Exmaple on Packages

package Collage;
public class Student
{
    public int Sno;
    public String sname;
    public int m1,m2,tot;
    public Student()
    {
        System.out.println("Studenst logic");

    }
    public void tot()
    {
        tot=m1+m2;
    }
    public display()
    {

        System.out.println("Student nnumber is "+Sno);
        System.out.println("Student name is "+sname);
        System.out.println("Marks ara "+m1+" and "+m2);
        System.out.println("Totak marks are "+tot);

    }
}
