package practice.java;

class PrefixVsPostfix
{
   public static void main(String args[])
   {
      int a=1;
      int b=1;
 
      System.out.println("The value of variable 'a' before decrement using prefix operator="+a); //1
      System.out.print("The value of variable 'a' while decrement using prefix operator=");
      System.out.println(--a);//0
      System.out.print("The value of variable 'a' after decrement using prefix operator=");
      System.out.println(a);//0
 
      System.out.println();
 
      System.out.println("The value of variable 'b' before decrement using postfix operator="+b);//1
      System.out.print("The value of variable 'b' while decrement using postfix operator=");
      System.out.println(b--);//1
      System.out.print("The value of variable 'a' after decrement using postfix operator=");
      System.out.println(b) ;//0
   }
 }


//The value of variable 'a' before decrement using prefix operator=1
//The value of variable 'a' while decrement using prefix operator=0
//The value of variable 'a' after decrement using prefix operator=0
//
//The value of variable 'b' before decrement using postfix operator=1
//The value of variable 'b' while decrement using postfix operator=1
//The value of variable 'a' after decrement using postfix operator=0
//