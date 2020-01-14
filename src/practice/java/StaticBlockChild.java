package practice.java;

public class StaticBlockChild extends StaticBlock {

	/**
	 * 1. static block executes even before the constructor.even when in subclass
	      when object is created static block of Parent class is executed before static block of Child
	  
	 */

	static int empId;
	String name;

	public StaticBlockChild() {

		System.out.println("Default Constructor of Child Class");
	}
   
	static {
		empId = 10;
		System.out.println("From Static Block of Child Class");
	}

	public static void main(String[] args) {
		StaticBlockChild sb = new StaticBlockChild();
		
		
		// System.out.println(StaticBlockChild.empId);

	}
}

/*
From Static Block of Parent
From Static Block of Child Class
Default Constructor of Parent
Default Constructor of Child Class
 */
 
 
 
 
