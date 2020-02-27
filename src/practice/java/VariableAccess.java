package practice.java;

public class VariableAccess {

	/*
	 * 1. Instance variable can be accessed directly by non static methods
	      Refer below example. "id" is accessed directly by "m1" method.
	      
	   2. Local variables should be Initialized. JVM does not provide any value for local variables.
	      If we try to use them without initialization we would get CE error. Refer 2##
	 */
	
	//##1
	int id;
	int testvariable;  //this wont be accessible by static main. Normal method can access both static/non static
	public void m1() {
		id = 12;
		System.out.println(id);
	}

	public static void main(String[] args) {
		
		//##2 
		int nonInitLocal;
		System.out.println(nonInitLocal);  //CE The local variable local may not have been initialized
		
		
		//##2 with local variable value
				int intLocal=12;
				System.out.println(intLocal);  //44 As variable initialized we wont see any error
				
		//#3 Cannot make a static reference to the non-static field testvariable
				//testvariable=3;	//static method can access static variables 
		
		
		VariableAccess va = new VariableAccess();
		va.m1(); //12
	}
	
	
	
	
}
