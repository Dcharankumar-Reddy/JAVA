//Example on Input from the keyboard -Scanner (product of three numbers) 
import java.util.*;
class Scnner_product_of_three_real_numbers 
{
    public static void main(String arg[])
    {
        Scanner f = new Scanner(System.in);
        int a,b,c,res;

        System.out.println("Enter First number");
        a=f.nextInt();
        System.out.println("Enter Second nsumber");
        b=f.nextInt();
        System.out.println("Enter Thired number");
        c=f.nextInt();
        res=a*b*c;
        System.out.println("Product of three numbers are "+res);
    }
}
