// Example on double dimension Array -new operator
class Array_double_dim_new_operator
{
    public static void main (String x[])
    {
        int a[][] =new int [3][3];// Declaration 
        a[0][0]=10; a[0][1]=20;a[0][2]=30;
        a[1][0]=40;a[1][1]=50;a[1][2]=60;
        a[2][0]=70;a[2][1]=80;a[2][2]=90;// intialization
        
         System.out.println(a[0][0]+" "+a[0][1]+ " "+a[0][2]);
         System.out.println(a[1][0]+" "+a[1][1]+ " "+a[1][2]);
         System.out.println(a[2][0]+" "+a[2][1]+ " "+a[2][2]);

    }
}