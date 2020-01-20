package practice.java;

import java.util.Arrays;

public class ArraystoString {
	
	public static void main(String[] args) {
		
		int []value= {1,2,3,4,5};
		
		//.toString will only print memory reference address and not element
		System.out.println(value.toString());//[I@2a139a55
		
		
		//Hence we can use Arrays.toString
		
		System.out.println(Arrays.toString(value));//[1, 2, 3, 4, 5]
		
		
	}

}
