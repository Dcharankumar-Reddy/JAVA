// Exampple on multidimension Arrays_constants
class Array_multi_dimension
{
    public static void main (String arg[])
    {
        int a[][][]={{{10,20},{30,40}},{{50,60},{70,80}}};//decleration
        //display
        System.out.println(a[0][0][0]+" "+a[0][0][1]+ " "+a[0][1][0]+" "+a[0][1][1]);
        System.out.println(a[1][0][0]+" "+a[1][0][1]+ " "+a[1][1][0]+" "+a[1][1][1]);

    }
}