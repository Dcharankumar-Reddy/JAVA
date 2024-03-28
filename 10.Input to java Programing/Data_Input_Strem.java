public class Data_Input_Strem 
{
   public static void main(String arg[])
   {
    DataInputStream ds=new DataInputStream(System.in);
    int a,b,res;
    System.out.println("Enter first number");
    a=Integer.parseInt(ds.readline());
    System.out.println("Enter Second number");
    b=Integer.parseInt(ds.readlin());
    res=a+b;
    System.out.println("Final Result is "+res);
   }
}
