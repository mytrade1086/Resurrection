package practice.java;

public class GenericMethodDemo {
	
//#Problem: Loop through Array of any data type( except primitive)
//Solution 1: Overload methods with String Array,Integer Array
//Solun2 : Generic method . Observe E before return type and Array type.
	
	public <E>void loopArray(E[]str) {	
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);		
		}			
	}
	
	
	public static void main(String[] args) {	
		GenericMethodDemo gmd=new GenericMethodDemo();
		gmd.loopArray(new String[] {"sumit","neha","shanu","mac"});
		gmd.loopArray(new Integer[] {1,2,4,5,10});
		
	}

}
