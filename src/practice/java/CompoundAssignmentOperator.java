package practice.java;

class CompoundAssignmentOperator
{
   public static void main(String args[])
   {
      int a=4;
      a*=4;   //Using Compound assignment operator to multiply the variable 'a' value by 4 i.e. 4*4
      System.out.println("a="+a);
   }
}

//Output of this program:
//a=16
//The a*=4; statement works like a=a*4 i.e. a=4*4; i.e. a=16