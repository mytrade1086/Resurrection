package practice.java;

public class SwitchWithoutBreak
{
   public static void main(String args[])
   {
      int a=0;

      switch(a)
      {

        case 0:
           System.out.println("The value of a is zero");

        case 1:
           System.out.println("The value of a is one");

        case 2:
           System.out.println("The value of a is two");

         default:
           System.out.println("The value of a is "+a);

      }
   }
}


//The value of a is zero
//The value of a is one
//The value of a is two
//The value of a is 0


