// Exmaple on anonimus inner class
abstract class  Student
{
  String name;
  abstract void  study();
}
class Anonimus_inner_class
{  
  public static void main (String arg[])
  {
   Student s= new Student()
   { 
    void study()
    {
      System.out.println("Study java and enjoy pandago");
    }
   };
  s.name="prem";
  System.out.println("Student name is "+s.name);
  s.study(); 
 }
}