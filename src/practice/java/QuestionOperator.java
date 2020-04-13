package practice.java;

public class QuestionOperator
{
   public static void main(String args[])
   {
      int i=10;

      int k= i<0 ? -i: i;    
      // i<0 is true then -i after the question mark will be assigned to variable 'k' else value of i will be assigned

      System.out.println("k="+k);

   }
 }