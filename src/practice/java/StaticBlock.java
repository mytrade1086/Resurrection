package practice.java;

public class StaticBlock {
	/**
	 1. static block executes even before the constructor.
	 2.
	 */

	static int empId;
	String name;
	
	public StaticBlock() {
	
		System.out.println("Default Constructor of Parent");
	}


	static {
		empId=10;
		System.out.println("From Static Block of Parent");
		//name="sumit"; //says cant access non static members in statis way
	}
	
	
	
	
	public static void main(String[] args) {
		StaticBlock sb=new StaticBlock();
		System.out.println(StaticBlock.empId);
		
	}
}


