package practice.java;
public class VariableScope {

	int studID;
	static int colleneName;
		
	public VariableScope(float newvariable) {
	//#1 Lesson 1:	 not necessary to have class variable only in constructor	
	}
	//public VariableScope(float anotheFloat) {
	//#2 this wont work as both constructors are float	
		
	//}
	
	public void nonStatictestMethod() {
	System.out.println("Inside Non static method" );
	//#3
	System.out.println(studID);  //WORKS ( access to non static is not an issue)
	
	//#4
	System.out.println(colleneName);  //WORKS( access to  static is not an issue)	
	}
	
public static void StatictestMethod() {
	System.out.println("Inside Static method" );
	
	//#5
	//System.out.println(studID);  //can't access non static inside static
	}

public void localmehtod() {
	
	int localVar;
	int localVa2=0;
	
//	static int test;  //#6 Only final is allowed inside local block
	
	//if(localVar>0) {		
		//#7 local variable to be initialized before use
	//}
	
	
	for(int i=0;i<3;i++) {
	int count=0;
	if (i==3) {
		System.out.println(localVa2);
	}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





	
	
	
}
