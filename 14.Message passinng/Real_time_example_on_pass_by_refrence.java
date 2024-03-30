// Example on pass by reference -Real time Example 
//patient  and Doctor
import java.util.*;
class Patient
{
    String pname,prob;
    int pamt;
    void patient_name()
    {
        System.out.println("Name of the patient "+pname);
        System.out.println("problem of the patient "+prob);
        System.out.println(" patient amount is  "+pamt);
    }
}
class Docter
{
    String Dname,spe;
    int damt;
    void doct()
    {
        System.out.println("Name of the Docter "+Dname);
        System.out.println("Docter Specilization"+spe);

    }
    void treatment(Patient x)
    {
       x.prob="Cured";
       x.pamt-=100;
        damt+=100;

    }
}
class Pharam
{
    String Pname;
    int amt;
    void pharam()
    {
        System.out.println("Nmae of the pharama "+Pname);
        System.out.println("pharama amount is "+amt);
    }
    void scale(Patient y)
    {
        y.pamt-=300;
        amt+=300;
    }
}


// Main Program(Hopital)
public class Real_time_example_on_pass_by_refrence 
{
    public  static void main(String arg[])
    {
        Patient p=new Patient ();
        Docter d=new Docter();
        Pharam h=new Pharam();
        Scanner s=new Scanner (System.in);
        System.out.println("Enter Patient Name");
        
        p.pname=s.next();
        System.out.print("Patient Problem");
        
        p.prob=s.next();
        System.out.println("Enter Patient Amount");
        p.pamt=s.nextInt();
        System.out.println("Enter name of the  Docter");
        d.Dname=s.next();
        System.out.println("Specialization Of the Docter");
        d.spe=s.next();
        System.out.println("Enter pharam name");
        h.Pname=s.next();
        System.out.println("Enter Pharma amount");
        h.amt=s.nextInt();

        p.patient_name();
        d.doct();
        h.pharam();
        d.treatment(p);
        h.scale(p);
        System.out.println("After Treatment ");
        p.patient_name();
        
        d.doct();
        
        h.pharam();
    
       


     }
}
