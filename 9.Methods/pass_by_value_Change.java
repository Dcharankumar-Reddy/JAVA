 // When variable is pass as perameter is called as pass by value
 // when object is passed as parameter is called as pass by reference
 // EXample on pass by value
 class pass_by_value_Change
 {
    static void change(int x,int y)
    {
        x+=100;
        y+=100;
        System.out.println("We are in Change Method");
        System.out.println("x="+x);
        System.out.println("y="+y);

    }
     public static void main(String arg[])
     {
        int a=10, b=21;
        change(a,b);
        System.out.println("a="+a);
        System.out.println("b="+a);
     }
 }