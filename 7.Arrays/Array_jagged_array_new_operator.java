// Example on Double dimensition array jagged arrays
class Array_jagged_array_new_operator
{
    public static void main(String arg[])
    {
        int a[][]=new int [3][];
        a[0]=new int[1];
        a[1]=new int[3];
        a[2]=new int[2];

        a[0][0]=10;
        a[1][0]=40;a[1][1]=50;a[1][2]=60;
        a[2][0]=70;a[2][1]=80;

        System.out.println(a[0][0]);
        System.out.println(a[1][0]+ " "+a[1][1]+" "+a[1][2]);
        System.out.println(a[2][0]+ " "+a[2][1]);


    }
}