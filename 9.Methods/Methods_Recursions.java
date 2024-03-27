//Recursion= Amethod calling by iself is called as Reursion
// Example on Methods 
class Methods_Recursions
{
    static int fact(int x)
    {
        if (x==1)
         return x;
        else
          return x*fact(x-1); 

    }
    public static void main(String arg[])
    {
        int n=5;
        int f=fact(n);
        System.out.println("factoriol of 5 is  "+f);
        System.out.println("factorial of 5 is  "+fact(5));// Directly taken
    }
}