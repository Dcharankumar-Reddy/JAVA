// Example on Short circuit Operator -&& By using if else ladder
class Logical_operator_circuit_Operator
{
    public static void main (String arg[])
    { 
        int a=10,b=12,c=13,big;
        if (a>b && a>c)
           big =a;
        else 
           if(b>c)
             big =b;
           else
             big =c;
                 
             System.out.println("The big number is "+big);
    }
}
