package accesspractice.java;

public class firstClass_Subclass extends firstClass {

	
	public static void main(String[] args) {
		System.out.println(varStrDefault);
		firstClass_Subclass fcs=new firstClass_Subclass();
		fcs.print();
	
	}
	
	
	public void print() {
		System.out.println(varStrDefault);
		System.out.println(age);
		//System.out.println(sal); cant access sal private variable
		
		System.out.println(collegeName);
	
		
	}
	
}
