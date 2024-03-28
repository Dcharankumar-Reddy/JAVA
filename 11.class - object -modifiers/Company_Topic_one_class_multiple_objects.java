class Employee
{
    int Empno,salary;
    String Empname;;
}
class Company_Topic_one_class_multiple_objects
{
    public static void main(String arg[])
    {
      Employee e= new Employee();
      e.Empno=1;
      e.salary=100000;
      e.Empname="Ramu";
      Employee s= new Employee();
      s.Empno=2;
      s.salary=200000;
      s.Empname="RamalingesswaraReddy";
      System.out.println("Employee1 number is "+e.Empno);
      System.out.println("Employe name is "+e.Empname);
      System.out.println("Salary of the Employee "+e.salary);
      System.out.println("Employee1 number is "+s.Empno);
      System.out.println("Employe name is "+s.Empname);
      System.out.println("Salary of the Employee "+s.salary);

    }

}
