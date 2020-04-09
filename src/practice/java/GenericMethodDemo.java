package practice.java;

public class GenericMethodDemo {

//#Problem: Loop through Array of any data type(except primitive)
//Solution 1 PolyMorphism: Overload methods with String Array,Integer Array
//Solution2 : Generic method . Observe E before return type and Array type.
	
	
	
	//Rules
	//#1 E should precede Return Type. E always refers to class type
	//#2 <E1,E2> allowed if needed
	//#3 Can return E type

	public <E> void loopArray(E[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	
	public <E> void loopArrayForEach(E[] str) {
		System.out.println("Printing with for each loop");
		for (E x : str) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		GenericMethodDemo gmd = new GenericMethodDemo();
		gmd.loopArray(new String[] { "sumit", "neha", "shanu", "mac" });	
//		sumit
//		neha
//		shanu
//		mac
		
		gmd.loopArray(new Integer[] { 1, 2, 4, 5, 10 });
//		1
//		2
//		4
//		5
//		10	
		
		gmd.loopArrayForEach(new Integer[] { 100, 200, 4, 5, 10 });
//		Printing with for each loop
//		100
//		200
//		4
//		5
//		10
	}

}
