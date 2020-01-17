package practice.java;

import java.util.ArrayList;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> aij = new ArrayList<Integer>(); 
		aij.add(10);
		aij.add(20);
		aij.add(30);
		
		//for integer i in integer arraylist aij 
		for(int i:aij) {	
			System.out.println(i);
		}
		
		//Lambda Expression
		aij.forEach((a)->System.out.println(a));
	}
	
	
}
