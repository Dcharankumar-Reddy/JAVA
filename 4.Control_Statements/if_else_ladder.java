// Example on if -Else ladder
class if_else_ladder
{
    public static void main(String arg[])
    {
        int grd=2;
        String res="";
        if (grd==1)
         res="First class";
        else 
           if (grd==2)
             res="Second class";
            else 
            if (grd==3)
              res="Third class";
            else
             res="failed";
    System.out.println("Result is "+grd);
    }
}