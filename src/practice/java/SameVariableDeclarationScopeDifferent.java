package practice.java;

public class SameVariableDeclarationScopeDifferent {

	
	//Notice that two times variable declaration allowed as scope was different
static int num=10;
     public static void main(String args[])
     {
             if(num>3)
          {
                int a;
                a=3;
           }
           
           else{
        	   int a; 
        	   a=4;
           }

     }
}