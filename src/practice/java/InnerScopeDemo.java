package practice.java;


class InnerScopeDemo
{
     public static void main(String args[])
     {                             // Outer scope started

              if(true)
              {                      // Inner scope started
                    int a=5;
              }                     // Inner scope ended

        System.out.println("a="+a);     // a is not accesible outside inner scope

      }                           // Outer scope ended

 }
