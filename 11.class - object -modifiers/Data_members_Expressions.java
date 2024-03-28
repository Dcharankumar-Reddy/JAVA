// Example on data members -Expression
//1.No Modifier- it can be used in the class and out of the class but not in packages
//2.Public- It can be used any place inyjhe program like inclass ,outclass, packages and other  etc
//3.private- It can be used  with in the class only
//4.Protected
 import java.util.*;
class Student 
{
    int Sno,m1,m2,m3;
     int tot,avg;
    public String name;
}
class Data_members_Expressions
{

public static void main(String ar[])
{
 Student s=new Student();
 s.Sno=23;
 s.name="D Charan kumar Reddy";
 s.m1=567;
 s.m2=23;
 s.m3=88;

 s.tot=s.m1+s.m2+s.m3;
 s.avg=s.tot/3;

 System.out.println("Student Number is  "+s.Sno);
 System.out.println("Student name is  "+s.name);

 System.out.println("Marks of the Student  is  "+s.m1+" "+s.m2+" "+s.m3);

 System.out.println("Total marks of the  Student is "+s.tot);
 System.out.println("Average marks of the Student is   "+s.avg);


}
}
