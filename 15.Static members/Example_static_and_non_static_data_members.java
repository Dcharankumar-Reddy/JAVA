// Example on Static and non Static data mmbers
// Static data members can call Directly by using class name With ou use of object
import java.util.*;
class Player
{
    String pname;
    int runs;
     static int total;
     static void  total_score()
    {
        System.out.println("Total Score is "+total);
    }
    void show()
    {
        System.out.println("Name of the player is "+pname );
        System.out.println("runs of the player "+runs);
        total=runs+total;
    }
}
public class Example_static_and_non_static_data_members 
{
 public static void main(String arg[])
 {
    Player p1=new Player();
    Player p2=new Player();
    Player p3=new Player();
    Player p4=new Player();
    Scanner s=new Scanner(System.in);
    p1.pname=s.next();
    p1.runs=s.nextInt();
    p2.pname=s.next();
    p2.runs=s.nextInt();
    p3.pname=s.next();
    p3.runs=s.nextInt();
    p4.pname=s.next();
    p4.runs=s.nextInt();
    p1.show();
    p1.total_score();
    p2.show();
    p2.total_score();
    p3.show();
    p3.total_score();
    p4.show();
    p4.total_score();

 }
}
