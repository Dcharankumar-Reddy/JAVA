
import test2.Student;
import test2.Faculty;
import java.util.*;
public class Package 
{
  public static void main(String arg[])
  {
     Scanner s=new Scanner (System.in);
     Student st=new Student ();
   // st.Student();
    st.Sno=s.nextInt();
    st.sname=s.next();
    st.m1=s.nextInt();
    st.m2=s.nextInt();
    st.tot();
    st.display();
    Faculty  f=new Faculty();
    f.Fno=s.nextInt();
    f.Fname=s.next();
     f.sal=s.nextInt();
     f.net=s.nextInt();
     f.salcal();
     f.display1();

  }
}
