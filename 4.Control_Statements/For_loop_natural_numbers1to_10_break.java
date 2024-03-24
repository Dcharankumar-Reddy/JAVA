// Example on for loop -natural numbers from 1to 10
//(break and continue)
/** 
class For_loop_natural_numbers1to_10_break
{
    public static void main(String arg[])
    {
        for(int i=1;i<=10;i++)
        {   
            if (i%2==0) continue;
            System.out.println(i);
            
        }
    }
}
*/
class For_loop_natural_numbers1to_10_break
{
    public static void main(String arg[])
    {
        for(int i=1;i<=10;i++)
        {   
            if (i%2==0) break;
            System.out.println(i);
            
        }
    }
}