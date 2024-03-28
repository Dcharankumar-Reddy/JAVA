//Example on Input from the keyboard
//Acccept Student no,name,marks in three Subjects, caluculate tot ,avg and display
class Student_Report_Input
{
    public ststic void main(String arg[])
    {
        int Sno,m1,m2,m3,tot,avg;
        String name
        Sno=Integer.parseInt(arg[0]);
        name=arg[1];
        m1=Integer.parseInt(arg[2]);
        m2=Integer.parseInt(arg[3]);
        m3=Integer.parseInt(arg[4]);
        tot=m1+m2+m3;
        avg=tot/3;
        System.out.println("Student number is  "+Sno);
        System.out.println("Student name is  "+name);
        System.out.println("Marks in Three Subjects"+m1+ " "+m2+" "+m3);
        System.out.println("Total marks are "+tot);
        System.out.println("Average of the marks "+avg);
    }
}