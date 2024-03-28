
//Example on  one object Reffering another object

class Student
{
    int Sno,score;
    String name,grade;
}

class Collage_Topic_one_objects_Refers_to_another_object 
{
    public static void main(String arg[])
    {
        Student s=new Student();
        Student v;
         
        s.Sno=23;
        s.name="charan";
        s.grade="A";
        s.score=97;
        v=s;
        System.out.println("Student number is "+s.Sno);
        System.out.println("Name of the Studnet is "+s.name);
        System.out.println("Grade of the student is"+s.grade);
        System.out.println("Score of the Student is "+s.score);
    }
}
