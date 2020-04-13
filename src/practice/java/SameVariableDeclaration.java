package practice.java;

class SameVariableDeclaration
{
     public static void main(String args[])
     {
         int a;

           if(true)
          {
                int a;   //ERROR not possible to declare same variable twice
           }

     }
 }