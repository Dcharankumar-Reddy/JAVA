// Example on Nested Blocks -With break-civilized
class Block_nested_With_break
{
    public static void main(String arg[])
    {   boolean flag;
         First:
         {
            System.out.println("I am first");
            Second:
            {
                flag=false;
                    if(flag)
                      break Second;
               System.out.println("I am Second");
                Third:
                {
                    flag=true;
                    if(flag)
                      break Third;
            System.out.println("I am Thired");
            
                }
            System.out.println("Good bye After thired block");
            }

         }
         
    }
}